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

```sql
SELECT nombre, SUM(precio) as suma_precio
FROM productos
GROUP BY nombre
HAVING SUM(stock) < 200
ORDER BY suma_precio DESC;
```

# JOIN

## Unir tablas

```sql
SELECT pedidos.id as id_pedido, clientes.nombre as nombre, pedidos.producto
FROM pedidos
INNER JOIN clientes
ON pedidos.id_cliente = clientes.id;
```

```sql
SELECT pedidos.id AS id_pedido, clientes.nombre AS nombre_cliente, pedidos.producto
FROM pedidos
LEFT JOIN clientes
ON pedidos.id_cliente = clientes.id;
```

```sql
SELECT clientes.nombre as nombre, COUNT(pedidos.id_cliente) as cantidad_productos
FROM clientes
INNER JOIN pedidos ON clientes.id = pedidos.id_cliente
GROUP BY clientes.nombre
HAVING COUNT(pedidos.id) > 1;
```

```sql
SELECT clientes.nombre as nombre_cliente
from clientes
INNER join pedidos on clientes.id = pedidos.id_cliente
WHERE pedidos.producto = 'pc';
```

## Unir tablas 2

```sql
SELECT DISTINCT  genero
from libros;
```

```sql
SELECT titulo, autor, precio
from libros
order by precio asc
limit 5;
```

```sql
SELECT titulo, autor, precio
from libros
where autor in ('Jane Austen','J.K. Rowling','J.R.R. Tolkien')
AND precio BETWEEN 10 AND 20;
```

```sql
SELECT titulo, autor
from libros
where titulo like '%el%';
```

```sql
SELECT titulo, precio
from libros
order by precio
limit 3 offset 2;
```

## Libros publicados

```sql
select libros.titulo
from libros
inner join editoriales on libros.id_editorial = editoriales.id
where anio_publicacion > 1990
and editoriales.nombre = 'HarperCollins';
```

## Autores con nacionalidad no definida

```sql
select autores.nombre , libros.titulo
from libros
inner join autores on libros.id_autor = autores.id
where autores.nacionalidad is null;
```

## Autores con libros

```sql
select autores.nombre
from autores
where exists (
    select 1
    from libros
    where libros.id_autor = autores.id
);
```

## Combinar nombres de autores y editoriales

```sql
SELECT nombre, 'Autor' AS tipo
FROM autores
UNION ALL
SELECT nombre, 'Editorial' AS tipo
FROM editoriales
ORDER BY nombre;

```

## Datos de los libros

```sql
SELECT libros.titulo as libro, autores.nombre as autor, editoriales.nombre as editorial, editoriales.fundacion as anno_fundacion
FROM libros
INNER JOIN autores ON libros.id_autor = autores.id
INNER JOIN editoriales ON libros.id_editorial = editoriales.id
WHERE (autores.nombre LIKE 'G%' OR autores.nombre LIKE 'I%')
AND editoriales.fundacion > 1950;

```

## Crear tabla sensores_ambiente

```sql
create table sensores_ambiente (
    id int primary key,
    ubicacion varchar(50) not null,
    temperatura real default 20.0,
    humedad int default 50,
    activo boolean default true,
    ultima_medicion timestamp default CURRENT_TIMESTAMP
);

```

```sql

```

```sql

```

```sql

```
