-- Tabla Cliente
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único del cliente
    nombre VARCHAR(255) NOT NULL, -- Nombre del cliente
    email VARCHAR(255) NOT NULL, -- Correo electrónico del cliente
    ciudad VARCHAR(255), -- Ciudad donde reside el cliente
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Fecha de registro del cliente
);

-- Tabla Producto
CREATE TABLE producto (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único del producto
    nombre VARCHAR(255) NOT NULL, -- Nombre del producto
    categoria VARCHAR(255) NOT NULL, -- Categoría del producto
    precio DECIMAL(10, 2) DEFAULT 0, -- Precio del producto
    perecedero BOOLEAN -- Indicador si el producto es perecedero
);

-- Tabla Venta (Tabla intermedia)
CREATE TABLE venta (
    idCliente INT NOT NULL, -- Identificador del cliente (FK)
    idProducto INT NOT NULL, -- Identificador del producto (FK)
    cantidad INT NOT NULL, -- Cantidad de productos vendidos
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Fecha de la venta
    PRIMARY KEY (idCliente, idProducto), -- Clave primaria compuesta
    FOREIGN KEY (idCliente) REFERENCES cliente (id), -- Relación con la tabla cliente
    FOREIGN KEY (idProducto) REFERENCES producto (id) -- Relación con la tabla producto
);
/*
Relaciones
Un cliente puede hacer muchas ventas → relación 1:N (cliente → venta).

Un producto puede aparecer en muchas ventas → relación 1:N (producto → venta).

La tabla venta es una tabla intermedia con una clave primaria compuesta por idCliente + idProducto. */

--obtener los productos de la categoría informatica cuyo precio esté entre 1000 y 1300.
--Muestra las columnas id, nombre, categoría y precio
SELECT id, nombre, categoria, precio
FROM producto
WHERE
    categoria = 'informatica'
    AND precio BETWEEN 1000 AND 1300;

/* Información detallada de las ventas, incluyendo los nombres de los clientes y productos:
Ordena la información por fecha de venta de forma descendente
Muestra las columnas nombre del cliente, email del cliente, ciudad del cliente; nombre del producto, categoría
del producto, cantidad de producto vestido, fecha de la venta y cantidad total de la venta (que será el
resultado de multiplicar la cantidad vendida por el precio del producto)*/
SELECT cliente.nombre, cliente.email, cliente.ciudad, producto.nombre, producto.categoria, venta.cantidad, venta.fecha, (
        venta.cantidad * producto.precio
    )
FROM venta
    JOIN cliente ON venta.idCliente = cliente.id
    JOIN producto ON venta.idProducto = producto.id
ORDER BY venta.fecha DESC;

/* ¿Cuáles son las categorías de productos cuyo precio promedio es superior a 200? asegurarte de que el precio promedio se muestre con solo 2 decimales.
Muestra la categoría y el precio_promedio.
ordena por el precio_promedio de forma ascendente.*/

SELECT producto.categoria, ROUND(AVG(producto.precio), 2) AS precio_promedio
FROM producto
GROUP BY
    producto.categoria
HAVING
    AVG(producto.precio) > 200
ORDER BY precio_promedio ASC;

-- incrementa el precio de los productos de informatica en un 10%
UPDATE producto
SET
    precio = precio * 1.10
WHERE
    categoria = 'informatica';

-- elimina los productos perecederos cuyo precio sea menor a 5 euros

DELETE FROM producto WHERE perecedero = TRUE AND precio < 5;

-- encuentra los clientes que nunca han realizado una compra
-- muestra su id de cliente y su nombre
SELECT cliente.id, cliente.nombre
FROM cliente
    LEFT JOIN venta ON cliente.id = venta.idCliente
WHERE
    venta.idCliente IS NULL;

--obtener lo productos mas caros de cada categoria
-- muestra la columna nombre de producto, cartegoria de producto y precio de producto.
--usa una subconsulta
SELECT p.nombre, p.categoria, p.precio
FROM producto p
WHERE
    p.precio = (
        SELECT MAX(precio)
        FROM producto
        WHERE
            categoria = p.categoria
    );

--Para cada producto indica si es caro, medio o barato.
--Será caro si precio es inferior a 100 euros.
--Será medio si su precio está entre 100 y 500 euros.
--Será caro en caso contrario.
SELECT
    p.nombre,
    p.categoria,
    p.precio,
    CASE
        WHEN p.precio < 100 THEN 'Barato'
        WHEN p.precio BETWEEN 100 AND 500  THEN 'Medio'
        ELSE 'Caro'
    END AS clasificacion
FROM producto p;


--------------------------------------------------

-- Crear la base de datos
CREATE DATABASE BibliotecaDB;
USE BibliotecaDB;

-- Tabla de Usuarios
CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    telefono VARCHAR(15),
    tipo ENUM('estudiante', 'profesor', 'invitado') NOT NULL DEFAULT 'estudiante',
    fecha_registro DATE NOT NULL DEFAULT (CURRENT_DATE)
);

-- Crear las tablas necesarias

-- Tabla de Libros
CREATE TABLE Libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    anno_publicacion YEAR NOT NULL CHECK (anno_publicacion < 1800),
    categoria ENUM('ciencia', 'historia', 'literatura', 'tecnologia', 'otros') NOT NULL DEFAULT 'otros',
    ejemplares_disponibles SMALLINT NOT NULL CHECK (ejemplares_disponibles >= 0)
);

-- Tabla de Autores
CREATE TABLE Autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    pais_origen VARCHAR(100)
);

-- Tabla de relación entre Libros y Autores (muchos a muchos)
CREATE TABLE Libro_Autor (
    id_libro INT NOT NULL,
    id_autor INT NOT NULL,
    PRIMARY KEY (id_libro, id_autor),
    FOREIGN KEY (id_libro) REFERENCES Libros(id),
    FOREIGN KEY (id_autor) REFERENCES Autores(id)
);

-- Tabla de Préstamos
CREATE TABLE Prestamos (
    id_prestamo INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_libro INT NOT NULL,
    fecha_prestamo DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_devolucion DATE NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES Usuarios(id),
    FOREIGN KEY (id_libro) REFERENCES Libros(id),
    CHECK (fecha_devolucion > fecha_prestamo)
);

-- Crear un índice para mejorar las consultas en la tabla Usuarios
CREATE INDEX idx_email_usuarios ON Usuarios(email);

--  Insertar 5 registros en la tabla Usuarios

INSERT INTO Usuarios (nombre, apellido, email, telefono, tipo)
VALUES
('Ana', 'García', 'ana.garcia@email.com', '123456789', 'estudiante'),
('Luis', 'Pérez', 'luis.perez@email.com', '987654321', 'profesor'),
('María', 'López', 'maria.lopez@email.com', '555123456', 'invitado'),
('Carlos', 'Sánchez', 'carlos.sanchez@email.com', '444555666', 'estudiante'),
('Elena', 'Martínez', 'elena.martinez@email.com', '333222111', 'estudiante');

