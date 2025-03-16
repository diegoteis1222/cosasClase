# Sencillos

## Añadir datos a una tabla

```sql
INSERT INTO productos(nombre, precio, stock)
VALUES ('Zapatos', 10.5, 100);
```

## Añadir multiples datos a una tabla

```sql
INSERT INTO productos (nombre, precio, stock)
VALUES ('Falda', 20, 150),
 ('Pantalón', 45.6, 200 ),
 ('Chaqueta', 150, 75 );
```

## Modificar datos en una tabla

```sql
UPDATE productos
SET precio = 30
WHERE id = 4;
```

## Borrar datos de una tabla

```sql
DELETE FROM productos
WHERE   nombre = 'Falda'
```

## Obtener datos de una tabla

```sql
SELECT nombre, precio
FROM productos
```

## Filtrar datos de una tabla

```sql
SELECT nombre, precio
FROM productos
WHERE precio > 45.6;
```

## Obtener datos de una tabla de forma ordenada

```sql
SELECT nombre, precio, stock
FROM productos
WHERE precio < 100
ORDER BY precio DESC;
```

## Contar elementos de una tabla

```sql
SELECT COUNT(nombre)
FROM productos
WHERE nombre = 'Falda';
```

## Sumar elementos de una tabla

```sql
SELECT SUM(precio)
FROM productos
WHERE nombre = 'Falda';
```

## Agrupar elementos de una tabla

```sql
SELECT nombre, SUM(precio) as suma_precio, SUM(stock) as suma_stock
FROM productos
GROUP BY nombre
ORDER BY suma_stock ASC;
```

## Agrupar elementos de una tabla

```sql
SELECT nombre, SUM(precio) as suma_precio
FROM productos
GROUP BY nombre
HAVING SUM(stock) < 200
ORDER BY suma_precio DESC;
```

```sql

```

```sql

```

```sql

```

```sql

```

```sql

```

```sql

```
