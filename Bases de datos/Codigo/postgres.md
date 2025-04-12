# Comandos postgres 

## Para conectar al postgress
```sql
psql -h localhost -U postgres 
```

## Para ver las bases de datos
```sql
\l 
```

## Para crear la base de datos
```sql
CREATE DATABASE escuelaDB;
```

## Para entrar a la base de datos
```sql
\c escuelaDB
```

## Para crear la tabla con parametros
```sql
CREATE TABLE estudiantes( 
    id INTERGER PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL);
    ```

## Para añadir datos
```sql
INSERT INTO estudiantes
VALUES
(1, 'Ana'),
(2, 'Juan')
;
```

## Para ver si se añadieron
```sql
SELECT * FROM estudiantes;
```