INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Matematicas', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Programacion I', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Ingenieria de Sofware', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Historia', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Biología', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Literatura', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Geografía', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Economía', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Inglés', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Arte', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Educación Física', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Informática', 1);
INSERT INTO "t_materias" ("nombre", "activo") VALUES ('Psicología', 1);

INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('John', 'Dow', 'Down', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Luis', 'Hernández', 'García', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Ana', 'Martínez', 'López', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Carlos', 'González', 'Sánchez', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Laura', 'Pérez', 'Ramírez', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Javier', 'Vargas', 'Mendoza', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Patricia', 'Cruz', 'Herrera', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Miguel', 'Torres', 'Navarro', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Sofía', 'Gómez', 'Jiménez', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Diego', 'Ramos', 'Silva', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Fernanda', 'Luna', 'Ortega', 1);
INSERT INTO "t_alumnos" ("nombre", "ap_paterno", "ap_materno", "activo") VALUES ('Saul', 'Rocha', 'Fragoso', 1);

INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 1, '9.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 1, '7.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 1, '10.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 2, '8.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 2, '7.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 2, '9.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 2, '8.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 2, '7.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 2, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 2, '8.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 2, '9.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (6, 3, '7.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (7, 3, '8.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (8, 3, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (9, 3, '8.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (10, 3, '7.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 3, '8.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 3, '9.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 3, '8.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 4, '8.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 4, '7.60', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 4, '9.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 4, '8.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 4, '7.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (6, 4, '8.60', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (7, 4, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (8, 4, '8.40', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (9, 4, '7.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (10, 4, '9.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 5, '7.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 5, '9.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 5, '8.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 5, '7.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 5, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 5, '8.60', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 5, '7.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 5, '9.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (6, 6, '8.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (7, 6, '7.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (8, 6, '9.40', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (9, 6, '8.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (10, 6, '7.60', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 6, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 6, '8.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 6, '7.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 7, '9.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 7, '8.40', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 7, '7.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 7, '9.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 7, '8.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (6, 7, '9.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (7, 7, '8.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (8, 7, '9.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (9, 7, '8.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (10, 7, '7.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 8, '9.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 8, '8.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 8, '7.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 8, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 8, '8.60', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 8, '7.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 8, '9.40', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 8, '8.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (6, 9, '8.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (7, 9, '9.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (8, 9, '8.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (9, 9, '7.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (10, 9, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 9, '8.60', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 9, '7.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 9, '9.40', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 10, '9.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 10, '8.80', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 10, '9.10', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 10, '8.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 10, '7.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (6, 10, '9.40', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (7, 10, '8.90', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (8, 10, '7.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (9, 10, '9.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (10, 10, '8.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (11, 11, '8.50', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (12, 11, '7.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (13, 11, '9.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (1, 11, '8.00', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (2, 11, '7.70', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (3, 11, '9.20', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (4, 11, '8.30', '2023-05-21');
INSERT INTO "t_calificaciones" ("id_t_materias", "id_t_alumnos", "calificacion", "fecha_registro") VALUES (5, 11, '9.10', '2023-05-21');