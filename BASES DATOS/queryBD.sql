CREATE DATABASE escuela;
USE escuela;

CREATE TABLE Modulos(
	codigo INT AUTO_INCREMENT,
    nombre_modulo VARCHAR(30),
    fk_id_profesor INT NOT NULL UNIQUE,
    PRIMARY KEY(codigo),
    FOREIGN KEY (fk_id_profesor) REFERENCES Profesores(id),
    FOREIGN KEY (fk_expediente_alumno) REFERENCES Profesores(id)

);
CREATE TABLE Profesores(
	id INT AUTO_INCREMENT,
    DNI CHAR(9) NOT NULL UNIQUE,
    nombre_profesor VARCHAR(30) NOT NULL,
    direccion_profesor VARCHAR(30) NOT NULL,
    telefono_profesor VARCHAR(30) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Alumnos(
	id INT AUTO_INCREMENT,
    nombre_alumno VARCHAR(30) NOT NULL,
    direccion_profesor VARCHAR(30) NOT NULL,
    telefono_profesor VARCHAR(30) NOT NULL,
    expediente VARCHAR(15) NOT NULL UNIQUE,
    PRIMARY KEY(expediente)
    
);
CREATE TABLE Curso(
	id INT AUTO_INCREMENT,
    nombre_curso VARCHAR(8) NOT NULL,
    
    
);
CREATE TABLE Delegados(
	id INT AUTO_INCREMENT, 
    nombre_modulo VARCHAR(30)
);
