
## MERGE:

- Combina la funcionalidad de INSERT y UPDATE en una sola operación.
- Es útil cuando se quiere insertar nuevos datos si no existen o actualizarlos si ya existen.

```sql
MERGE INTO tabla_destino AS destino
USING tabla_fuente AS fuente
ON destino.columna = fuente.columna
WHEN MATCHED THEN
    UPDATE SET destino.columna1 = fuente.columna1
WHEN NOT MATCHED THEN
    INSERT (columna1, columna2)
    VALUES (fuente.columna1, fuente.columna2);
```

## UNION

```sql
SELECT nombre
FROM proveedores 
UNION 
select nombre 
from clientes
```

```sql
SELECT 'prov',nombre
FROM proveedores 
UNION ALL --AL sirve por si hay 2 con el mismo nombre
select 'cli',nombre 
from clientes

--El 'prov'/'cli' es para difenciar los dos nombres
```

## Comparar nulos

```sql
SELECT *
from proveedores p 
where telefono is null --O is not null

--se usa para comparar nulos
```