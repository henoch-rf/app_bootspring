CREATE DATABASE `apirestdb`

CREATE TABLE `articulo` (
  `id` varchar(10) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `modelo` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `precio` decimal(12,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO apirestdb.articulo (id,descripcion,modelo,nombre,precio) VALUES ('A001','Descripción de artículo Id: A011.','2020z','Artículo 2025A',123.99);
INSERT INTO apirestdb.articulo (id,descripcion,modelo,nombre,precio) VALUES ('A002','Descripción de artículo Id: A123.','2028a','Artículo 2024B',456.89);
INSERT INTO apirestdb.articulo (id,descripcion,modelo,nombre,precio) VALUES ('A003','Descripción de artículo Id: A033.','2028f','Artículo 2025B',789.0);