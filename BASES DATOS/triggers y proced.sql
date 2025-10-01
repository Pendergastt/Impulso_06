# DROP DATABASE ejercicio1;

CREATE DATABASE ejercicio1;

USE ejercicio1;

CREATE TABLE clientes(
id_cliente INT AUTO_INCREMENT,
nombre VARCHAR(100),
telefono VARCHAR(100),
DNI CHAR(9),
PRIMARY KEY(id_cliente)
);

CREATE TABLE copia_clientes(
id_copia INT AUTO_INCREMENT,
id_c_cliente INT,
nombre VARCHAR(100),
telefono VARCHAR(100),
DNI CHAR(9),
PRIMARY KEY(id_copia)
);

#DROP TRIGGER copiaCliente
DELIMITER //
CREATE TRIGGER copiaCliente
AFTER INSERT ON clientes
FOR EACH ROW
INSERT INTO copia_clientes VALUES (null,NEW.id_cliente,NEW.nombre,NEW.telefono,NEW.dni);
END
//

#DROP TRIGGER borradoCliente
CREATE TRIGGER borradoCliente
AFTER DELETE ON clientes
FOR EACH ROW
INSERT INTO copia_clientes VALUES (null,OLD.id_cliente,OLD.nombre,OLD.telefono,OLD.dni);
END//
DELIMITER ;


INSERT INTO clientes VALUE(null,"Juan","77845","00000000A");
INSERT INTO clientes VALUE(null,"Perico","77855","00000000B");

SELECT * FROM clientes;
SELECT * FROM copia_clientes;

DELETE FROM clientes WHERE id_cliente=3;

SELECT * FROM clientes;
SELECT * FROM copia_clientes;


DELIMITER //
CREATE PROCEDURE operaciones (IN n1 INT, IN n2 INT, OUT suma INT, OUT resta INT, OUT multiplicación INT, OUT división INT)
BEGIN
SET suma= n1+n2;
SET resta= n1-n2;
SET multiplicacion= n1*n2;
SET division = n1/n2;
RETURN @suma;
#SELECT @suma AS Suma,@resta AS Resta,@multiplicacion AS Multicpllic,@division AS Divsion;
END;
END//
DELIMITER ;

SELECT operaciones(4,5,3);




