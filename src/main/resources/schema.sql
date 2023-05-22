CREATE TABLE "t_alumnos" (
	id_t_alumnos INTEGER Generated Always as Identity,
	nombre VARCHAR ( 80 ),
	ap_paterno VARCHAR ( 80 ),
	ap_materno VARCHAR ( 80 ),
	activo INTEGER,
	PRIMARY KEY ( id_t_alumnos ) 
); 
CREATE TABLE "t_materias" (
	id_t_materias INTEGER Generated Always as Identity,
	nombre VARCHAR ( 80 ), 
	activo INTEGER, 
	PRIMARY KEY ( id_t_materias ) 
);
CREATE TABLE "t_calificaciones" (
	id_t_calificaciones INTEGER Generated Always as Identity,
	id_t_materias INTEGER NOT NULL,
	id_t_alumnos INTEGER NOT NULL,
	calificacion DECIMAL ( 10, 2 ),
	fecha_registro DATE,
	PRIMARY KEY ( id_t_calificaciones ),
	FOREIGN KEY ( id_t_alumnos ) REFERENCES t_alumnos ( id_t_alumnos ),
	FOREIGN KEY ( id_t_materias ) REFERENCES t_materias ( id_t_materias ) 
);
