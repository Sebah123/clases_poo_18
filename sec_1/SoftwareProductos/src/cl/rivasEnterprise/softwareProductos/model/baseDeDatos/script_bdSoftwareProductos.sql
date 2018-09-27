CREATE DATABASE bdSoftwareProducto;

USE bdSoftwareProducto;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    run VARCHAR(13),
    nombre VARCHAR(100),
    pass VARCHAR(100),
    PRIMARY KEY(id)
);

INSERT INTO usuario VALUES(NULL, '11-1','nombre 1','111');
INSERT INTO usuario VALUES(NULL, '22-2','nombre 2','222');
INSERT INTO usuario VALUES(NULL, '33-3','nombre 3','333');

CREATE TABLE producto(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    marca VARCHAR(100),
    stock INT,
    precio INT,
    PRIMARY KEY(id)
); 

INSERT INTO producto VALUES(NULL, 'Producto 1','Marca 1','100','1000');
INSERT INTO producto VALUES(NULL, 'Producto 2','Marca 2','200','2000');
INSERT INTO producto VALUES(NULL, 'Producto 3','Marca 3','300','3000');
INSERT INTO producto VALUES(NULL, 'Producto 4','Marca 4','400','4000');
INSERT INTO producto VALUES(NULL, 'Producto 5','Marca 4','500','5000');

/* -------- SELECTS ---------*/
SELECT * FROM usuario;
SELECT * FROM producto;
/* -------- SELECTS ---------*/


/* -------- DELETES ---------*/
DELETE FROM usuario;
DELETE FROM producto;
/* -------- DELETES ---------*/

/* -------- DROPS ---------*/
DROP TABLE producto;
DROP TABLE usuario;
DROP DATABASE bdSoftwareProducto;
/* -------- DROPS ---------*/



/*Análisis de las consultas del proyecto*/
/*1.- El usuario pueda iniciar sesión a 
través de su run y pass*/
/*1.1- Cuando el usuario pueda iniciar sesión, se mostrará su nombre*/
/*
Posibles resultados: 
    OK  --> 1 registro
    Mal --> 0 registros
*/

/*
in  --> run, pass --> String run, String pass
out --> nombre    --> String nombre
*/
SELECT 
    nombre
FROM 
    usuario
WHERE 
    run = '11-1' AND
    pass = '123123';

/*2.- El usuario va a poder crear un producto*/
/*
in  --> * atributos del Producto (EX ---> id) --> Producto p
out --> nada --> void
*/
INSERT INTO 
    producto 
VALUES(
    NULL, 
    'Producto 6',
    'Marca 4',
    '600',
    '6000'
);

/*3.- El usuario va a poder eliminar un producto a través de su id*/
/*
in  --> id --> int id
out --> vacío --> void
*/
DELETE FROM 
    producto
WHERE 
    id = '6';



/*4.- El usuario va a poder ver una lista con los productos*/
/*4.4 Todos los productos*/
/*
in  --> nada --> ()
out --> Los productos --> List<Producto>
*/
SELECT 
    * 
FROM
    producto;



/*5.- El usuario va a poder buscar un producto por lo que sea (nombre o marca)*/
/*
in  --> String texto    --> filtro
out --> Los productos   --> List<Producto>
*/

SELECT 
    *
FROM 
    producto
WHERE 
    nombre LIKE '%1%' OR
    marca LIKE '%1%';


/*6.- El usuario va a poder actualizar un 
producto (precio y el stock) por id */
/*
in  --> id, precio, stock --> Producto p --> modificados
out --> void 
*/
UPDATE
    producto
SET
    precio = '1890',
    stock = '200'
WHERE
    id = '1';



/*Análisis de las consultas del proyecto*/
