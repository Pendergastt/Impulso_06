##CREATE DATABASE escuela;
USE escuela;


CREATE TABLE Profesores(
	id INT AUTO_INCREMENT,
    DNI CHAR(9) NOT NULL UNIQUE,
    nombre_profesor VARCHAR(30) NOT NULL,
    direccion_profesor VARCHAR(30) NOT NULL,
    telefono_profesor VARCHAR(30) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Modulos(
	id INT AUTO_INCREMENT,
    codigo VARCHAR(30) NOT NULL UNIQUE,
    nombre_modulo VARCHAR(30)NOT NULL,
    fk_id_profesor INT NOT NULL UNIQUE,
    PRIMARY KEY(id),
    FOREIGN KEY (fk_id_profesor) REFERENCES Profesores(id)
);

CREATE TABLE Alumnos(
	id INT AUTO_INCREMENT,
    nombre_alumno VARCHAR(30) NOT NULL,
    apellidos_alumno VARCHAR(30) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    expediente VARCHAR(15) NOT NULL UNIQUE,
    PRIMARY KEY(id)
    
);

CREATE TABLE Modulos_alumnos(
	id INT AUTO_INCREMENT,
	fk_id_modulo INT NOT NULL,
	fk_id_alumno INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (fk_id_modulo) REFERENCES modulos(id),
	FOREIGN KEY (fk_id_alumno) REFERENCES alumnos(id)
);

CREATE TABLE cursos(
	id INT AUTO_INCREMENT,
	nombre VARCHAR(100) NOT NULL,
	fk_id_alumno INT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (fk_id_alumno) REFERENCES alumnos(id)
);

# metemos los datos
INSERT INTO modulos_alumnos VALUES (null,1,1);
INSERT INTO modulos_alumnos VALUES (null,1,2);
INSERT INTO modulos_alumnos VALUES (null,1,3);
INSERT INTO modulos_alumnos VALUES (null,1,1);
