/*  comentario */

/*Si la base de datos "alumnos_ico" existe eliminala*/
DROP SCHEMA IF EXISTS `alumnos_ico`;

/*la creacion de mi base de datos si esque no existe y le estamos poniendo la codificación para los caracteres raros de nuestro idioma 'ñ'*/
CREATE SCHEMA IF NOT EXISTS `alumnos_ico` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;


/*usamos nuestra base de datos*/
USE `alumnos_ico`;
/*crear nuestra tablita*/
CREATE TABLE `ESTUDIANTE`(
    `nombre_alumno` text not null,
    `carrera` text not null,
    `numero_cuenta` int (9) not null,
    `telefono` varchar (8) not null,
    `permisos` int (2) not null default '1',
    `fecha_registro` datetime not null default current_timestamp

) ENGINE=InnoDB DEFAULT CHARSET= utf8;

/*AGREGAR UN REGISTRO*/

INSERT INTO `ESTUDIANTE`(  `nombre_alumno`,`carrera`, `numero_cuenta`,  `telefono`)    VALUES
('Aaron Velasco','ICO', '413112576','56418189');

/*  año-mes-dia hora-minutos-segundos */

/*definimos una llave primaria o PK*/

alter table `ESTUDIANTE`
    add primary key (`numero_cuenta`);








