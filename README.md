# Desarrolla tu primera API REST desde cero con Spring Boot aplicando buenas practicas

Este proyecto tiene la configuración y desarrollo necesario para que comiences a crear tu primera API REST desde cero con Spring Boot aplicando buenas practicas para potenciar tus proyectos. 

## Explicación del proyecto

Puedes ver a detalle el proyecto directamente desde mi canal de YouTube [https://youtu.be/klV9hheS86o](https://youtu.be/klV9hheS86o)


## Script de la base de datos

```
create database db_springboot_dev;

CREATE TABLE `db_springboot_dev`.`clientes` (
  `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `fecha_registro` date  NOT NULL,
  PRIMARY KEY (`id_cliente`));

USE db_springboot_dev; 
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Ben', 'Tennyson', 'ben10@cn.com', '2023-08-04');

SELECT * FROM clientes;
```

## Arquitectura N-CAPAS

<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/j2pHvdfB/n-capas.png' border='0' alt='n-capas'/></a>

#####  JSON - Project
```json
{
  "mensaje": "",
  "object": [
    {
      "idCliente": 1,
      "nombre": "Kevin",
      "apellido": "rens",
      "correo": "rens123@gmail.com",
      "fechaRegistro": "2023-03-08T05:00:00.000+00:00"
    },
    {
      "idCliente": 2,
      "nombre": "Israel",
      "apellido": "Inocente",
      "correo": "israel123@gmail.com",
      "fechaRegistro": "2023-03-08T05:00:00.000+00:00"
    },
    {
      "idCliente": 3,
      "nombre": "Messi",
      "apellido": "rens",
      "correo": "rens9256@gmail.com",
      "fechaRegistro": "2023-02-28T05:00:00.000+00:00"
    },
    {
      "idCliente": 4,
      "nombre": "Leonar",
      "apellido": "rens",
      "correo": "rens1233@gmail.com",
      "fechaRegistro": "2023-07-31T05:00:00.000+00:00"
    }
  ]
}
```