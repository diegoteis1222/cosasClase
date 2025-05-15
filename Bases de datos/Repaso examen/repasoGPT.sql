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