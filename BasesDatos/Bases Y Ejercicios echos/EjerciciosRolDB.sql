-- Obtener todos los personajes de un jugador específico.
set @nombreBuscado = 'Carlos Gomez';

select j.nombre, p.nombre
from personajes p
    join jugadores j on p.jugadorId = j.id
where
    j.nombre = @nombreBuscado

-- Listar las habilidades de una clase determinada.
select h.nombre
from habilidades h
    join clases c on c.id = h.claseId
where
    c.nombre = 'Mago';

-- Mostrar los objetos en el inventario de un personaje.
set @nombrePersonaje = 'Zephira';

select
    p.nombre as nombrePersonaje,
    o.nombre as nombreObjeto,
    i.cantidad
from
    objetos o
    join inventarios i on o.id = i.objetoId
    join personajes p on i.personajeId = p.id
where
    p.nombre = @nombrePersonaje

-- Ver el estado de las misiones de un personaje.
set @nombrePersonaje = 'Azelia';

select
    p.nombre as nombrePersonaje,
    pm.estado,
    m.nombre as nombreMision
from
    progresomisiones pm
    join misiones m on m.id = pm.misionId
    join personajes p on p.id = pm.personajeId
where
    p.nombre = @nombrePersonaje
order by pm.estado

-- Muestra cuántos personajes tiene cada jugador, ordenado por los que tienen más.
SELECT j.nombre AS jugador, COUNT(p.id) AS cantidadPersonajes
FROM jugadores j
    right JOIN personajes p ON j.id = p.jugadorId
GROUP BY
    j.id,
    j.nombre
ORDER BY cantidadPersonajes DESC;

-- Lista los personajes que han acumulado más de 5000 puntos de experiencia.
SELECT nombre, experiencia
FROM personajes
WHERE
    experiencia > 5000
ORDER BY experiencia DESC;

-- Muestra los datos del personaje dado.
-- El nombre del personaje a buscar, se guardará en una variable

SET @nombreBuscado = 'Azelia';
-- Simula una entrada del usuario
SELECT nombre, nivel, experiencia
FROM personajes
WHERE
    nombre = @nombreBuscado;

-- Muestra los 4 personajes con mayor experiencia.
SELECT
    nombre,
    nivel,
    experiencia,
    ubicacion
FROM personajes
ORDER BY experiencia DESC
LIMIT 4;

-- Muestra el nombre del personaje y el nombre de su clase a la que pertenecen.

SELECT p.nombre AS personaje, c.nombre AS clase
FROM personajes p
    JOIN clases c ON p.claseId = c.id;

-- Muestra todas las habilidades de la clase "Mago".
SELECT h.nombre AS habilidad, c.nombre AS clase
FROM habilidades h
    JOIN clases c ON h.claseId = c.id
WHERE
    c.nombre = 'Mago';

-- Encuentra los jugadores que aún no han creado ningún personaje.

SELECT j.nombre AS jugador
FROM jugadores j
    LEFT JOIN personajes p ON j.id = p.jugadorId
WHERE
    p.id IS NULL;

-- Lista las misiones que el personaje "Kragg" ha aceptado pero no ha completado.
SELECT m.nombre, pm.estado
FROM
    misiones m
    JOIN progresoMisiones pm ON m.id = pm.misionId
    JOIN personajes p ON p.id = pm.personajeId
WHERE
    p.nombre = 'Kragg'
    AND pm.estado = 'aceptada';

-- Mostrar la cantidad de misiones completadas por cada personaje
SELECT p.nombre, COUNT(pm.misionId) AS misionesCompletadas
FROM
    personajes p
    JOIN progresoMisiones pm ON p.id = pm.personajeId
WHERE
    pm.estado = 'completada'
GROUP BY
    p.nombre
ORDER BY misionesCompletadas DESC;

-- Muestra el nombre del jugador que tiene la mayor cantidad total de oro sumando sus personajes.
SELECT j.nombre AS nombreJugador, SUM(p.oro) AS totalOro
FROM jugadores j
    JOIN personajes p ON j.id = p.jugadorId
GROUP BY
    j.nombre
ORDER BY totalOro DESC
LIMIT 1;

-- No funciona
select j.nombre
from jugadores j
         join personajes p on j.id = p.jugadorId
group by p.nombre
having sum(p.oro) = (
    select max(totalOro)
    from (
             select sum(p.oro) as totalOro
             from jugadores j
                      join personajes p on j.id = p.jugadorId
             group by p.id;

)as subquery )

-- Muestra los 5 objetos legendarios más caros en el juego.
SELECT nombre, tipo, precio
FROM objetos
WHERE
    rareza = 'legendario'
ORDER BY precio DESC
LIMIT 5;

-- Lista las 5 misiones con mayor recompensa en oro.
SELECT nombre, oroRecompensa
FROM misiones
ORDER BY oroRecompensa DESC
LIMIT 5;

-- Ver qué personajes (y sus jugadores)  han completado la misión "Caza de Bestias Salvajes"
SELECT
    p.nombre AS nombrePersonaje,
    j.nombre AS nombreJugador
FROM
    progresoMisiones pm
    JOIN misiones m ON pm.misionId = m.id
    JOIN personajes p ON pm.personajeId = p.id
    JOIN jugadores j ON p.jugadorId = j.id
WHERE
    m.nombre = 'Caza de Bestias Salvajes'
    AND pm.estado = 'completada';

-- Lista los personajes que poseen al menos un objeto legendario de mas de 4000 de oro en su inventario.
SELECT DISTINCT
    p.nombre AS nombrePersonaje,
    o.nombre as objeto
FROM
    personajes p
    JOIN inventarios i ON p.id = i.personajeId
    JOIN objetos o ON i.objetoId = o.id
WHERE
    o.rareza = 'legendario'
    AND o.precio > 4000;

-- Lista los jugadores que han completado al menos 7 misiones.
SELECT j.nombre, COUNT(pm.misionId) AS misionesCompletadas
FROM
    jugadores j
    JOIN personajes p ON j.id = p.jugadorId
    JOIN progresoMisiones pm ON p.id = pm.personajeId
WHERE
    pm.estado = 'completada'
GROUP BY
    j.id
HAVING
    COUNT(pm.misionId) >= 7
ORDER BY misionesCompletadas DESC;

-- Encuentra personajes que no han aceptado ninguna misión.
SELECT p.nombre
FROM
    personajes p
    LEFT JOIN progresoMisiones pm ON p.id = pm.personajeId
WHERE
    pm.personajeId IS NULL;

-- Lista los personajes que han completado misiones pero no tienen objetos legendarios en su inventario.
SELECT DISTINCT
    p.nombre AS nombrePersonaje
FROM
    personajes p
    JOIN progresoMisiones pm ON p.id = pm.personajeId
    LEFT JOIN inventarios i ON p.id = i.personajeId
    LEFT JOIN objetos o ON i.objetoId = o.id
WHERE
    pm.estado = 'completada'
    AND (
        o.id IS NULL
        OR o.rareza != 'legendario'
    );

-- Obtener la experiencia media de todos los personajes con 2 decimales
SELECT ROUND(AVG(experiencia), 2) AS experienciaMedia
FROM personajes;

-- Encontrar jugadores que tienen personajes con más experiencia que el promedio de todos los personajes
-- Nota: usa una subquery
SELECT DISTINCT
    j.nombre AS nombreJugador,
    p.nombre,
    p.experiencia
FROM jugadores j
    JOIN personajes p ON j.id = p.jugadorId
WHERE
    p.experiencia > (
        SELECT AVG(experiencia)
        FROM personajes
    );