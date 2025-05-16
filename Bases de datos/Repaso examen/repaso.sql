INSERT INTO
    productos (nombre, precio, stock)
VALUES ('Zapatos', 10.5, 100);

INSERT INTO
    productos (nombre, precio, stock)
VALUES ('Falda', 20, 150),
    ('Pantalón', 45.6, 200),
    ('Chaqueta', 150, 75);

UPDATE productos SET precio = 30 WHERE id = 4;

DELETE FROM productos WHERE nombre = 'Falda'

SELECT nombre, stock, precio
FROM productos
WHERE
    precio < 100
ORDER BY precio DESC

SELECT count(*) FROM productos WHERE nombre = 'Falda';

SELECT SUM(precio) FROM productos WHERE nombre = 'Falda';

SELECT
    nombre,
    SUM(precio) AS suma_precio,
    SUM(stock) AS suma_stock
FROM productos
GROUP BY
    nombre
ORDER BY suma_stock ASC;

SELECT nombre, SUM(precio) AS suma_precio
FROM productos
GROUP BY
    nombre
HAVING
    SUM(stock) < 200
ORDER BY suma_precio ASC;

CREATE TABLE Usuarios (
    id int auto_increment PRIMARY KEY,
    nombre varchar(30) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(255),
    UNIQUE NOT NULL,
    telefono VARCHAR(15),
    tipo enum(
        'estudiante',
        'profesor',
        'invitado'
    ) DEFAULT 'estudiante',
    fecha_registro DATE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Libros (
    id int auto_increment PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    anno_publicacion YEAR NOT NULL CHECK (anno_publicacion < 1800),
    categoria enum(
        'ciencia',
        'historia',
        'literatura',
        'tecnologia',
        'otros'
    ) DEFAULT 'otros',
    ejemplares_disponibles SMALLINT NOT NULL CHECK (ejemplares_disponibles >= 0)
);

CREATE TABLE autores (
    id int auto_increment PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    pais_origen VARCHAR(100)
);

CREATE TABLE prestamos (
    id_prestamo int auto_increment PRIMARY KEY,
    id_usuario int,
    id_libro int,
    fecha_prestamo datetime DEFAULT CURRENT_TIMESTAMP,
    fecha_devolucion DATE CHECK (
        fecha_devolucion > fecha_prestamo
    ),
    FOREIGN KEY (id_usuario) REFERENCES Usuarios (id),
    FOREIGN KEY (id_libro) REFERENCES Libros (id)
);

CREATE TABLE Libro_Autor (
    id_libro INT NOT NULL,
    id_autor INT NOT NULL,
    FOREIGN KEY (id_libro) REFERENCES Libros (id),
    FOREIGN KEY (id_autor) REFERENCES Autores (id)
);

CREATE INDEX idx_email_usuarios ON Usuarios (email);

INSERT INTO
    Usuarios (
        nombre,
        apellido,
        email,
        telefono,
        tipo
    )
VALUES (
        /* meter aqui los values aleatorios */
    );

-- 1
SELECT id, nombre, categoria, precio
FROM producto
WHERE
    categoria = 'informatica'
    AND precio BETWEEN 1000 AND 1300;

-- 2
SELECT cliente.nombre, cliente.email, cliente.ciudad, producto.nombre, producto.categoria, venta.cantidad, venta.fecha (
        venta.cantidad * producto.precio
    ) AS total_venta
FROM venta
ORDER BY venta.fecha DESC
    JOIN cliente ON cliente.id = venta.idcliente
    JOIN producto ON producto.id = venta.idproducto

-- 3

SELECT categoria, round(avg(precii) 2) AS precio_promedio
FROM producto
WHERE
    precio_promedio > 200
ORDER BY precio_promedio ASC;
-- 4
UPDATE producto
SET
    precio = precio * 1.10
WHERE
    categoria = 'informatica';

-- 5
DELETE FROM producto WHERE pereceros = TRUE AND precio < 5;

-- 6
SELECT cliente.id, cliente.nombre
FROM cliente
    LEFT JOIN venta ON cliente.id = venta.idcliente
WHERE
    cantidad > 0;

-- 7
SELECT nombre, categoria, precio
FROM producto
WHERE
    precio = (
        SELECT max(precio)
        FROM productos
        GROUP BY
            nombre
    )