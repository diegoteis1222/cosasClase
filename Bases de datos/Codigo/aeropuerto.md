# Aeropuerto y su explicacion
```sql
drop table reservas;
drop table pasajeros;
drop table vuelos;
drop table personal;
drop table aeropuerto;
 
create table aeropuerto (
	id serial primary key,
	nombre varchar(30) not null,
	codigo varchar(30) not null unique,
	ciudad varchar(30) not null,
	estado varchar(30) not null
);

create table personal (
	id serial primary key,
	nombre varchar(30) not null,
	apellido varchar(50) not null,
	puesto varchar(100) not null,
	id_aeropuerto integer references aeropuerto(id) on delete cascade
);

create table vuelos (
    id serial primary key,
    numero_vuelo varchar(30) not null,
	fecha_salida timestamp not null,
	fecha_llegada timestamp not null,
	estado varchar(30) not null default 'Scheduled',
	aeropuerto_salida integer references aeropuerto(id) on delete cascade,
	aeropuerto_llegada integer  references aeropuerto(id) on delete cascade,
	constraint check_times check (fecha_salida < fecha_llegada ),
	constraint check_states check (estado in ('Scheduled', 'Completed', 'Cancelled', 'Delayed'))
);

create table pasajeros (
	id serial primary key,
	nombre varchar(100) not null,
	apellido varchar(200) not null,
	email varchar(255) not null unique,
	telefono varchar(20)
);

create table reservas (
    id_vuelo integer not null references vuelos(id) on delete cascade,
    id_pasajero integer not null references pasajeros(id) on delete cascade, 
	fecha timestamp not null default(current_timestamp),
	asiento integer not null check (asiento >= 1),
	primary key (id_vuelo, id_pasajero)
);
```

# Datos para la db
```sql
INSERT INTO aeropuerto (nombre, codigo, ciudad, estado) 
VALUES 
('Aeropuerto Internacional de Barcelona El Prat', 'BCN', 'Barcelona', 'Cataluña'), 
('Aeropuerto Adolfo Suárez Madrid-Barajas', 'MAD', 'Madrid', 'Madrid'), 
('Aeropuerto Internacional de Cancún', 'CUN', 'Cancún', 'Quintana Roo'), 
('Aeropuerto Internacional de Ciudad de México', 'MEX', 'Ciudad de México', 'CDMX'), 
('Aeropuerto de Londres-Heathrow', 'LHR', 'Londres', 'Inglaterra'),
('Aeropuerto Internacional de Los Ángeles', 'LAX', 'Los Ángeles', 'California'), 
('Aeropuerto de São Paulo-Guarulhos', 'GRU', 'São Paulo', 'São Paulo'), 
('Aeropuerto Internacional de Tokio Narita', 'NRT', 'Tokio', 'Kanto'), 
('Aeropuerto Internacional de Frankfurt', 'FRA', 'Frankfurt', 'Hesse'), 
('Aeropuerto Internacional de Sídney', 'SYD', 'Sídney', 'Nueva Gales del Sur'), 
('Aeropuerto Internacional de París Charles de Gaulle', 'CDG', 'París', 'Isla de Francia'), 
('Aeropuerto Internacional de Roma-Fiumicino', 'FCO', 'Roma', 'Lazio'), 
('Aeropuerto de Bogotá El Dorado', 'BOG', 'Bogotá', 'Cundinamarca'),
('Aeropuerto Internacional de Ámsterdam Schiphol', 'AMS', 'Ámsterdam', 'Países Bajos'), 
('Aeropuerto Internacional de Dubái', 'DXB', 'Dubái', 'Emiratos Árabes Unidos'), 
('Aeropuerto Internacional de Hong Kong', 'HKG', 'Hong Kong', 'Región Administrativa Especial'),
('Aeropuerto Internacional de Toronto Pearson', 'YYZ', 'Toronto', 'Ontario'), 
('Aeropuerto de Cancún Internacional', 'CUN', 'Cancún', 'Quintana Roo'), 
('Aeropuerto Internacional de Los Ángeles', 'LAX', 'Los Ángeles', 'California'), 
('Aeropuerto de Lima Jorge Chávez', 'LIM', 'Lima', 'Callao'); 

INSERT INTO vuelos (numero_vuelo, fecha_salida, fecha_llegada, aeropuerto_salida, aeropuerto_llegada, estado) 
VALUES ('IB1234', '2025-01-15 08:30:00', '2025-01-15 10:45:00', 1, 2, 'Scheduled'), 
('IB5678', '2025-01-15 09:00:00', '2025-01-15 14:00:00', 2, 1, 'Cancelled'), 
('AM4321', '2025-01-15 10:30:00', '2025-01-15 12:00:00', 4, 3, 'Scheduled'), 
('LH9876', '2025-01-15 11:15:00', '2025-01-15 12:50:00', 5, 1, 'Completed'), 
('AA6789', '2025-01-15 13:00:00', '2025-01-15 15:30:00', 6, 2, 'Scheduled'), 
('BA4567', '2025-01-16 14:45:00', '2025-01-16 17:00:00', 2, 5, 'Scheduled'), 
('AF1234', '2025-02-10 06:00:00', '2025-02-10 08:30:00', 7, 3, 'Cancelled'),
('JL7890', '2025-02-20 07:00:00', '2025-02-20 14:00:00', 8, 1, 'Completed'), 
('QF8765', '2025-02-25 09:30:00', '2025-02-25 12:00:00', 9, 10, 'Scheduled'),
('LA1122', '2025-03-01 13:00:00', '2025-03-01 16:00:00', 10, 4, 'Scheduled'),
('KL3589', '2025-03-05 08:00:00', '2025-03-05 10:00:00', 1, 2, 'Completed'), 
('VS1290', '2025-03-06 18:15:00', '2025-03-06 20:30:00', 2, 6, 'Cancelled'),
('NH9999', '2025-03-07 09:00:00', '2025-03-07 11:30:00', 3, 7, 'Scheduled'), 
('DL2305', '2025-03-08 07:00:00', '2025-03-08 09:00:00', 4, 5, 'Scheduled'), 
('UX9821', '2025-03-09 10:30:00', '2025-03-09 12:00:00', 5, 8, 'Completed'), 
('PR2345', '2025-03-10 12:45:00', '2025-03-10 15:15:00', 6, 3, 'Cancelled'),
('SU2876', '2025-03-12 13:00:00', '2025-03-12 15:30:00', 7, 9, 'Scheduled'), 
('TK1594', '2025-03-13 14:15:00', '2025-03-13 16:00:00', 8, 10, 'Scheduled'),
('EY3045', '2025-03-14 09:00:00', '2025-03-14 11:30:00', 9, 1, 'Completed'), 
('OS1423', '2025-03-15 11:30:00', '2025-03-15 13:45:00', 10, 2, 'Scheduled'); 

INSERT INTO pasajeros (nombre, apellido, email, telefono) 
VALUES 
('Juan', 'Pérez', 'juan.perez@email.com', '612345678'),
('Ana', 'García', 'ana.garcia@email.com', '623456789'),
('Carlos', 'Martínez', 'carlos.martinez@email.com', '634567890'), 
('Laura', 'Rodríguez', 'laura.rodriguez@email.com', '645678901'), 
('Miguel', 'López', 'miguel.lopez@email.com', '656789012'), 
('Patricia', 'Sánchez', 'patricia.sanchez@email.com', '667890123'), 
('Luis', 'Fernández', 'luis.fernandez@email.com', '678901234'), 
('Marta', 'Jiménez', 'marta.jimenez@email.com', '689012345'), 
('Raúl', 'Vázquez', 'raul.vazquez@email.com', '690123456'), 
('Beatriz', 'Hernández', 'beatriz.hernandez@email.com', '701234567'), 
('José', 'González', 'jose.gonzalez@email.com', '712345678'), 
('María', 'López', 'maria.lopez@email.com', '723456789'), 
('Tomás', 'Ramírez', 'tomas.ramirez@email.com', '734567890'), 
('Isabel', 'Pérez', 'isabel.perez@email.com', '745678901'), 
('Ricardo', 'Serrano', 'ricardo.serrano@email.com', '756789012'), 
('Antonio', 'Jiménez', 'antonio.jimenez@email.com', '767890123'), 
('Sonia', 'Torres', 'sonia.torres@email.com', '778901234'), 
('Berta', 'Fernández', 'berta.fernandez@email.com', '789012345'), 
('Rocío', 'Paredes', 'rocio.paredes@email.com', '790123456'); 

INSERT INTO reservas (id_pasajero, id_vuelo, asiento, fecha) 
VALUES
(1, 1, '12A', '2025-01-10 12:00:00'), 
(2, 1, '14B', '2025-01-10 13:00:00'), 
(3, 2, '15C', '2025-01-10 14:00:00'), 
(4, 3, '16D', '2025-01-11 08:00:00'), 
(5, 4, '17E', '2025-01-11 09:00:00'), 
(6, 5, '18F', '2025-01-12 10:00:00'),
(7, 6, '19A', '2025-01-12 11:00:00'), 
(8, 7, '20B', '2025-01-13 10:30:00'), 
(9, 8, '21C', '2025-01-13 12:00:00'), 
(10, 9, '22D', '2025-01-14 08:30:00'), 
(1, 10, '23E', '2025-02-05 09:30:00'), 
(2, 2, '24F', '2025-02-06 10:00:00'), 
(3, 3, '25A', '2025-02-07 11:00:00'), 
(4, 4, '26B', '2025-02-08 12:00:00'), 
(5, 5, '27C', '2025-02-09 13:00:00'), 
(6, 6, '28D', '2025-02-10 14:00:00'), 
(7, 7, '29E', '2025-02-11 15:30:00'), 
(8, 8, '30F', '2025-02-12 16:00:00'), 
(9, 9, '31A', '2025-02-13 17:00:00'), 
(10, 10, '32B', '2025-02-14 18:30:00'); 

INSERT INTO personal (nombre, apellido, puesto, id_aeropuerto)
values
('José', 'González', 'Piloto', 1), 
('María', 'Fernández', 'Azafata', 1),
('Luis', 'Ramírez', 'Controlador de tráfico aéreo', 2), 
('Eva', 'Martínez', 'Piloto', 3), 
('Pedro', 'Álvarez', 'Azafata', 4),
('Isabel', 'Vázquez', 'Mantenimiento', 5), 
('Carlos', 'Molina', 'Azafata', 6), 
('Laura', 'Serrano', 'Piloto', 7),
('Ricardo', 'Paredes', 'Controlador de tráfico aéreo', 8), 
('Ana', 'Gómez', 'Azafata', 9),
('Sergio', 'López', 'Piloto', 10),
('Carmen', 'Núñez', 'Azafata', 1), 
('Martín', 'Sánchez', 'Mantenimiento', 2), 
('Alberto', 'García', 'Controlador de tráfico aéreo', 3),
('Rocío', 'Torres', 'Piloto', 4),
('Adriana', 'Martín', 'Azafata', 5),
('Javier', 'Lozano', 'Mantenimiento', 6), 
('Berta', 'Campos', 'Azafata', 7), 
('Tomás', 'Jiménez', 'Piloto', 8);
```