CREATE DATABASE bd_seccion_1;
USE bd_seccion_1;

CREATE TABLE alumno(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO alumno VALUES(NULL, 'Julio Leiva');

SELECT * FROM alumno;