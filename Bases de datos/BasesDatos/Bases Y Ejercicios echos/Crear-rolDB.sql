use roldb;

drop table progresoMisiones;
drop table misiones;
drop table inventarios;
drop table objetos;
drop table personajes;
drop table clasesPersonajes;
drop table jugadores;

CREATE TABLE jugadores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    correo VARCHAR(255) UNIQUE NOT NULL,
    fechaRegistro DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE clasesPersonajes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    descripcion TEXT NOT NULL
);

CREATE TABLE personajes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    nivel INT DEFAULT 1 CHECK (nivel >= 1),
    experiencia INT DEFAULT 0 CHECK (experiencia >= 0),
    salud INT DEFAULT 100 CHECK (salud >= 0),
    mana INT DEFAULT 100 CHECK (mana >= 0),
    oro INT DEFAULT 0 CHECK (oro >= 0),
    ubicacion VARCHAR(100) DEFAULT 'Ciudad Inicial',
    estado ENUM(
        'vivo',
        'muerto',
        'descansando'
    ) DEFAULT 'vivo',
    fechaCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    idJugador INT NOT NULL,
    idClasesPersonaje INT NOT NULL,
    FOREIGN KEY (idJugador) REFERENCES jugadores (id) ON DELETE CASCADE,
    FOREIGN KEY (idClasesPersonaje) REFERENCES clasesPersonajes (id) ON DELETE CASCADE
);

CREATE TABLE habilidades (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT NOT NULL,
    idClasesPersonaje INT NOT NULL,
    FOREIGN KEY (idClasesPersonaje) REFERENCES clasesPersonajes (id) ON DELETE CASCADE
);

CREATE TABLE objetos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    descripcion TEXT NOT NULL,
    tipo ENUM(
        'arma',
        'armadura',
        'pocion',
        'otro'
    ) NOT NULL,
    efecto TEXT,
    rareza ENUM(
        'comun',
        'raro',
        'epico',
        'legendario'
    ) NOT NULL DEFAULT 'comun',
    precio INT CHECK (precio >= 0),
    usoLimitado BOOLEAN DEFAULT FALSE
);

CREATE TABLE inventarios (
    idPersonaje INT NOT NULL,
    idObjeto INT NOT NULL,
    cantidad INT DEFAULT 1 CHECK (cantidad >= 1),
    PRIMARY KEY (idPersonaje, idObjeto),
    FOREIGN KEY (idPersonaje) REFERENCES personajes (id) ON DELETE CASCADE,
    FOREIGN KEY (idObjeto) REFERENCES objetos (id) ON DELETE CASCADE
);

CREATE TABLE misiones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(200) NOT NULL,
    descripcion TEXT NOT NULL,
    expRecompensa INT CHECK (expRecompensa >= 0),
    oroRecompensa INT DEFAULT 0 CHECK (oroRecompensa >= 0),
    nivelRequerido INT DEFAULT 1 CHECK (nivelRequerido >= 1),
    tipo ENUM(
        'principal',
        'secundaria',
        'diaria'
    ) DEFAULT 'secundaria',
    idObjetoRecompensa INT NULL,
    FOREIGN KEY (idObjetoRecompensa) REFERENCES objetos (id) ON DELETE SET NULL
);

CREATE TABLE progresoMisiones (
    idPersonaje INT,
    idMision INT,
    estado ENUM(
        'aceptada',
        'completada',
        'fallada'
    ) DEFAULT 'aceptada',
    PRIMARY KEY (idPersonaje, idMision),
    FOREIGN KEY (idPersonaje) REFERENCES personajes (id) ON DELETE CASCADE,
    FOREIGN KEY (idMision) REFERENCES misiones (id) ON DELETE CASCADE
);