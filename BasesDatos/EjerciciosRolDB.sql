-- Listar las habilidades de una clase determinada.
select h.nombre
from habilidades h
         join clases c on c.id = h.claseId
where c.nombre = 'Mago';

-- Obtener todos los personajes de un jugador específico.
select p.nombre, o.nombre as objeto, i.cantidad
from objetos o
         join inventarios i on o.id = i.objetoId
         join personajes p on i.personajeId = i.personajeId
where p.nombre = "Silas";

-- Ver el estado de las misiones de un personaje.
select p.nombre, pr.estado, m.nombre as mision
from progresomisiones pr
         join misiones m on m.id = pr.misionId
         join personajes p on p.id = pr.personajeId
where p.nombre = "Silas";

-- Muestra cuántos personajes tiene cada jugador, ordenado por los que tienen más.
SELECT o.nombre, i.cantidad from objetos o
                                     join inventarios i on o.id = i.objetoId
                                     join personajes p on p.id = i.personajeId
where p.nombre = 'Silas';

-- Lista las misiones que el personaje "Kragg" ha aceptado pero no ha completado.
SELECT m.nombre, pm.estado
FROM misiones m
         JOIN progresoMisiones pm ON m.id = pm.misionId
         JOIN personajes p ON p.id = pm.personajeId
WHERE p.nombre = 'Kragg' AND pm.estado = 'aceptada';

-- Mostrar la cantidad de misiones completadas por cada personaje
SELECT p.nombre, COUNT(pm.misionId  ) AS misionesCompletadas
FROM personajes p
         JOIN progresoMisiones pm ON p.id = pm.personajeId
WHERE pm.estado = 'completada'
GROUP BY p.nombre
ORDER BY misionesCompletadas DESC;

-- Muestra el nombre del jugador que tiene la mayor cantidad total de oro sumando sus personajes.
SELECT j.nombre AS nombreJugador, SUM(p.oro) AS totalOro
FROM jugadores j
         JOIN personajes p ON j.id = p.jugadorId
GROUP BY j.nombre
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
)as subquery
)

-- Muestra los 5 objetos legendarios más caros en el juego.
SELECT nombre, tipo, precio
FROM objetos
WHERE rareza = 'legendario'
ORDER BY precio DESC
    LIMIT 5;

-- Lista las 5 misiones con mayor recompensa en oro.
SELECT nombre, oroRecompensa
FROM misiones
ORDER BY oroRecompensa DESC
    LIMIT 5;

-- Ver qué personajes (y sus jugadores)  han completado la misión "Caza de Bestias Salvajes"
SELECT p.nombre AS nombrePersonaje, j.nombre AS nombreJugador
FROM progresoMisiones pm
         JOIN misiones m ON pm.misionId = m.id
         JOIN personajes p ON pm.personajeId = p.id
         JOIN jugadores j ON p.jugadorId = j.id
WHERE m.nombre = 'Caza de Bestias Salvajes' AND pm.estado = 'completada';

-- Lista los personajes que poseen al menos un objeto legendario de mas de 4000 de oro en su inventario.
SELECT DISTINCT p.nombre AS nombrePersonaje,o.nombre as objeto
FROM personajes p
         JOIN inventarios i ON p.id = i.personajeId
         JOIN objetos o ON i.objetoId  = o.id
WHERE o.rareza = 'legendario' AND o.precio > 4000;

-- Lista los jugadores que han completado al menos 7 misiones.
SELECT j.nombre, COUNT(pm.misionId) AS misionesCompletadas
FROM jugadores j
         JOIN personajes p ON j.id = p.jugadorId
         JOIN progresoMisiones pm ON p.id = pm.personajeId
WHERE pm.estado = 'completada'
GROUP BY j.id
HAVING COUNT(pm.misionId) >= 7
ORDER BY misionesCompletadas DESC;

-- Encuentra personajes que no han aceptado ninguna misión.
SELECT p.nombre
FROM personajes p
         LEFT JOIN progresoMisiones pm ON p.id = pm.personajeId
WHERE pm.personajeId IS NULL;

-- Lista los personajes que han completado misiones pero no tienen objetos legendarios en su inventario.
SELECT DISTINCT p.nombre AS nombrePersonaje
FROM personajes p
         JOIN progresoMisiones pm ON p.id = pm.personajeId
         LEFT JOIN inventarios i ON p.id = i.personajeId
         LEFT JOIN objetos o ON i.objetoId = o.id
WHERE pm.estado = 'completada'
  AND (o.id IS NULL OR o.rareza != 'legendario');

-- Obtener la experiencia media de todos los personajes con 2 decimales
SELECT ROUND(AVG(experiencia), 2) AS experienciaMedia
FROM personajes;

-- Encontrar jugadores que tienen personajes con más experiencia que el promedio de todos los personajes
-- Nota: usa una subquery
SELECT DISTINCT j.nombre AS nombreJugador,p.nombre, p.experiencia
FROM jugadores j
         JOIN personajes p ON j.id = p.jugadorId
WHERE p.experiencia > (SELECT AVG(experiencia) FROM personajes);