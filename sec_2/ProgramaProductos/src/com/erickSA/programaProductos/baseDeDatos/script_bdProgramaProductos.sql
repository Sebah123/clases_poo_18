CREATE DATABASE bdProgramaProductos;

USE bdProgramaProductos;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    run VARCHAR(13),
    nombre VARCHAR(100),
    password VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO usuario VALUES(NULL, '11-1','nom1','111');
INSERT INTO usuario VALUES(NULL, '22-2','nom2','222');
INSERT INTO usuario VALUES(NULL, '33-3','nom3','333');

CREATE TABLE producto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    marca VARCHAR(100),
    precio INT,
    stock INT,
    PRIMARY KEY(id)
);

INSERT INTO producto VALUES(NULL, 'Jugo','Zuko','250','700');
INSERT INTO producto VALUES(NULL, 'Leche 1L','Soprole','700','200');
INSERT INTO producto VALUES(NULL, 'Galleta','Costa','350','1000');

SELECT * FROM usuario;
SELECT * FROM producto;

-- DROP DATABASE bdProgramaProductos;

/*Requerimientos Funcionales*/

/*1.- Debe iniciar sesión con el rut y pass*/
/*  1.1.- Al momento de ya iniciar sesión, mostrar el nombre */
/*
in  --> rut, password --> String rut, String password
out --> String nombre
*/
SELECT nombre FROM usuario WHERE run = '11-1' AND password = '111';







/*2.- Crear un producto*/
/*
in  --> Los datos del Producto (Excepción del id) -> Producto p
out --> nada --> void
*/
INSERT INTO producto VALUES(NULL, 'Pila AA','Duracell','500','1000');








/*3.- Ver un listado de productos*/
/*
in  --> nada --> ()
out --> Listado de productos --> List<Producto> --> 
*/
SELECT * FROM producto;








/*4.- Buscar un producto (nombre o marca)*/
/*
in  --> texto --> String texto
out --> Listado de productos --> List<Producto>
*/
SELECT * FROM producto WHERE nombre LIKE '%ko%' OR marca LIKE '%ko%';







/*5.- Eliminar un producto por id*/
/*
in  --> id --> int id;
out --> nada --> void
*/
DELETE FROM producto WHERE id = '2';









/*6.- Actualizar datos del producto (precio y stock)*/
/*
in  --> precio , stock e id --> Producto p
out --> nada --> void
*/



UPDATE 
    producto 
SET
    precio = '',
    stock = ''
WHERE 
    id = '';

