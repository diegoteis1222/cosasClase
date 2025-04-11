## Ejercicio 1
```sql
select pedidos.id as id_pedido, clientes.nombre as nombre, pedidos.producto as producto
from pedidos
inner join clientes
on pedidos.id_cliente = clientes.id
```

## Ejercicio 2

```sql
select pedidos.id as id_pedido, clientes.nombre as nombre_cliente, pedidos.producto as producto
from pedidos
left join clientes
on pedidos.id_cliente = clientes.id
```

## Ejercicio 3

```sql
SELECT clientes.nombre AS nombre, COUNT(pedidos.producto) AS cantidad_productos
FROM pedidos
LEFT JOIN clientes ON pedidos.id_cliente = clientes.id
GROUP BY clientes.nombre
HAVING COUNT(pedidos.producto) > 1
```