## Tipos de datos comunes en SQL

| Categoría         | Ejemplos                   |
| ----------------- | -------------------------- |
| **Numéricos**     | `INT`, `DECIMAL`, `FLOAT`  |
| **Texto**         | `CHAR`, `VARCHAR`, `TEXT`  |
| **Fechas y Hora** | `DATE`, `TIME`, `DATETIME` |
| **Binarios**      | `BLOB`, `BYTEA`            |

## Categorías de SQL

- **DQL**:

  - Utilizado para consultar los datos existentes en la base de datos.
  - ```sql
    SELECT * FROM usuarios; -- Consulta todos los datos de la tabla "usuarios"
    ```

- **DML**:

  - Permite insertar, actualizar y eliminar datos en la base de datos.
  - ```sql
    INSERT INTO usuarios (nombre, edad) VALUES ('Juan', 30); -- Inserta un nuevo usuario
    ```

- **DDL**:

  - Se usa para definir o modificar la estructura de la base de datos, como tablas y esquemas.
  - ```sql
    CREATE TABLE productos (id INT, nombre VARCHAR(100)); -- Crea una nueva tabla "productos"
    ```

- **DCL**:
  - Gestiona los permisos y controles de acceso a la base de datos.
  - ```sql
    GRANT SELECT ON usuarios TO 'juan'; -- Otorga permisos de consulta a Juan
    ```

## Tipos de JOIN en SQL

- **`INNER JOIN`** (o **`JOIN`** normal): Combina solo los registros que tienen coincidencia en ambas tablas.
- **`LEFT JOIN`**: Combina todos los registros de la tabla izquierda y los que tienen coincidencia en la derecha.
- **`RIGHT JOIN`**: Combina todos los registros de la tabla derecha y los que tienen coincidencia en la izquierda.
- **`FULL JOIN`**: Combina los registros de ambas tablas.

## Operadores de comparación más comunes

- `=`: Igual a.
- `!=` o `<>`: Diferente de.
- `>` , `<`: Mayor o menor que.
- `>=`, `<=`: Mayor o igual a, menor o igual a.
- `BETWEEN`: Entre dos valores.
- `LIKE`: Coincide con un patrón.
- `IN`: Coincide con uno de varios valores.
- `AND`, `OR`, `NOT`: Operadores lógicos.
- `IS NULL`, `IS NOT NULL`: Verificar si un valor es nulo o no nulo.
- `EXISTS`: Verificar si existe un subconjunto de resultados.
- `ANY`, `ALL`: Comparar un valor con cualquier valor o con todos los valores de un conjunto.

## Ejemplos simples

- Uso de GROUP BY (Agrupar resultados):

```sql
SELECT clase, COUNT(*)
FROM estudiantes
GROUP BY clase;
```

- Uso de HAVING (Filtrar grupos):

```sql
SELECT clase, COUNT(*)
FROM estudiantes
GROUP BY clase
HAVING COUNT(*) > 5;
```

- Ejemplo con AVG:

```sql
SELECT AVG(edad)
FROM estudiantes;
```

- Uso de JOIN (Unir tablas):

```sql
SELECT estudiantes.nombre, cursos.nombre
FROM estudiantes
JOIN cursos ON estudiantes.curso_id = cursos.id;
```

```sql

```

```sql

```

```sql

```
