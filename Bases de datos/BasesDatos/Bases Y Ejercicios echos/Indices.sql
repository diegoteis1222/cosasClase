-- Índice en la clave foránea de personajes para acelerar consultas por jugador
CREATE INDEX idx_personajes_jugadorId ON personajes (jugadorId);
-- Índice en la clave foránea de personajes para acelerar consultas por clase
CREATE INDEX idx_personajes_claseId ON personajes (claseId);
-- Índice en experiencia para mejorar consultas sobre nivel y progreso
CREATE INDEX idx_personajes_experiencia ON personajes (experiencia);
-- Índice en experiencia para optimizar cálculos de experiencia media de jugadores
CREATE INDEX idx_personajes_nivel ON personajes (nivel);
-- Índice en progreso de misiones para mejorar rendimiento en filtrado de estados
CREATE INDEX idx_progresoMisiones_estado ON progresoMisiones (estado);
-- Índice en misiones para mejorar consultas de recompensas y nivel requerido
CREATE INDEX idx_misiones_experiencia ON misiones (experienciaRecompensa);
CREATE INDEX idx_misiones_oro ON misiones (oroRecompensa);
CREATE INDEX idx_misiones_nivelRequerido ON misiones (nivelRequerido);
-- Índice en inventarios para optimizar búsquedas de objetos en posesión
CREATE INDEX idx_inventarios_personajeId ON inventarios (personajeId);
CREATE INDEX idx_inventarios_objetoId ON inventarios (objetoId);
-- Índice en jugadores para acelerar búsquedas por nombre y correo
CREATE INDEX idx_jugadores_nombre ON jugadores (nombre);
CREATE INDEX idx_jugadores_correo ON jugadores (correo);