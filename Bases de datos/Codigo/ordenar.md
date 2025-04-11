```sql
CREATE TABLE categiras (
id integer primary key,
nonbre varchar(10),
dreatedat datetime default current_timestamp --nos dice cuando fue creada y default le da un valor
)
```
```sql
alter table categiras rename to categorias
--------------------------------------
alter table categorias 
rename column nonbre to nombre 
--------------------------------------
alter table categorias 
add tipo varchar(10) not null
--------------------------------------
alter table categorias
drop column tipo
--------------------------------------
drop table categorias
```
