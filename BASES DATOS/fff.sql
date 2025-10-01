#drop database programacion

create database programacion;
Use programacion;

create table tabla0(
id_tabla0 INT AUTO_INCREMENT,
campo0 varchar(100),
primary key(id_tabla0)
);

CREATE TABLE tabla1(
	id_tabla1 INT AUTO_INCREMENT,
    campo1 VARCHAR(100),
    id_tabla0 INT,
    PRIMARY KEY(id_tabla1),
    FOREIGN KEY(id_tabla0)
    REFERENCES tabla0(id_tabla0)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE tabla2(
    id_tabla0 INT AUTO_INCREMENT, 
    campo0 VARCHAR(100), 
    PRIMARY KEY(id_tabla0)
); 

INSERT INTO tabla0 values(null, "Valor 1, campo 0");
INSERT INTO tabla0 values(null, "Valor 2, campo 0");

select * from tabla0;
select * from tabla1;
select * from tabla2;

# drop trigger ejemploAntesActualizar
DELIMITER // #HOLA
CREATE TRIGGER ejemploAntesActualizar
BEFORE UPDATE ON tabla0
FOR EACH ROW 
BEGIN
	
	INSERT INTO tabla2 VALUES (NULL, CONCAT("Valor insertado desde el trigger ejemploAntes de actualizar", OLD.campo0));
    
END //
DELIMITER ;

UPDATE tabla0 SET campo0 = "pruebaTriggerActualizar " WHERE id_tabla0 = 1;

SELECT * FROM tabla0;
SELECT * FROM tabla2;
