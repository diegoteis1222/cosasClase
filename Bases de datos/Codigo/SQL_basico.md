# Apuntes SQLite Basicos

## Tipos de datos comunes

| Categoria    | Ejemplos             | Uso                                                  |
| ------------ | -------------------- | ---------------------------------------------------- |
| Numericos    | INT, DECIMAL, FLOAT  | Almacenar números enteros o decimales.               |
| Texto        | CHAR, VARCHAR, TEXT  | Almacenar cadenas de texto de diferentes tamaños.    |
| Fecha y Hora | DATE, TIME, DATETIME | Almacenar fechas, horas o ambos.                     |
| Binarios     | BLOB, BYTEA          | Almacenar datos binarios como imágenes o documentos. |

## Operadores SQL más comunes

- **`=`**: Igual a.
- **`!=`** o **`<>`**: Diferente de.
- **`>`**, **`<`**: Mayor o menor que.
- **`>=`**, **`<=`**: Mayor o igual a, menor o igual a.
- **`BETWEEN`**: Entre dos valores.
- **`LIKE`**: Coincide con un patrón.
- **`IN`**: Coincide con uno de varios valores.
- **`AND`**, **`OR`**, **`NOT`**: Operadores lógicos.
- **`IS NULL`**, **`IS NOT NULL`**: Verificar si un valor es nulo o no nulo.
- **`EXISTS`**: Verificar si existe un subconjunto de resultados.
- **`ANY`**, **`ALL`**: Comparar un valor con cualquier valor o con todos los valores de un conjunto.

## Uso de Funciones de Agregación

- **`COUNT`**: Cuenta el número de filas.
- **`SUM`**: Suma los valores de una columna.
- **`AVG`**: Calcula el promedio de una columna.
- **`MIN`**: Encuentra el valor mínimo.
- **`MAX`**: Encuentra el valor máximo.

### Ejemplo

```sql
SELECT AVG(edad)
FROM estudiantes;
-- calcula la edad promedio de todos los estudiantes.
```

# Comandos Básicos

## Algunos ejemplos simples

```sql
SELECT * FROM usuarios;
--Consulta todos los datos de la tabla "usuarios"
INSERT INTO usuarios (nombre, edad) VALUES ('Juan', 30);
--Inserta un nuevo usuario
CREATE TABLE productos (id INT, nombre VARCHAR(100));
--Crea una nueva tabla "productos"
GRANT SELECT ON usuarios TO 'juan';
--Otorga permisos de consulta a Juan
```

## CREATE:

```sql
create table if not exists proveedores (
    id integer primary key autoincrement,
    nombre varchar(30) not null,
    telefono varchar(15)
)
```

## INSERT:

```sql
INSERT INTO Productos (nombre,precio)
VALUES ('alfombrilla', '8')
```

```sql
insert into proveedores (nombre, telefono)
values
('ZARA', '986112233'),
('MANGO', '986223344'),
('HM', NULL ),
('ZALANDO', '91232323')
```

## UPDATE:

```sql
UPDATE ventas
SET precio = 255
WHERE id = 7;
```

## DELETE:

```sql
Delete from ventas
where id = 7;
```

## RETURNING:

```sql
INSERT INTO tabla (columna1, columna2)
VALUES (valor1, valor2)
RETURNING columna1, columna2; --Obtiene los valores modificados por una consulta
```

## SELECT:

```sql
SELECT nombre,precio
FROM Productos
WHERE precio < 100; --Si el precio es menor de 100
```

## GROUP BY:

```sql
Select producto
from Ventas
group by producto --Agrupa todos los items con el mismo nombre, id...
```

## HAVING:

```sql
Select producto, sum(cantidad) as cantidadtotal --Le da el alias cantidadtotal a la suma de cantidad
from Ventas
having sum(cantidad) > 3 --Si la suma de cantidad es mayor de 3
```

```sql
Select  producto, sum( precio * cantidad)
from ventas v
group by producto
having producto = 'pantalon'
```