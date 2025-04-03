CREATE DATABASE `apirestdb`

CREATE TABLE `articulo` (
  `id` varchar(10) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `modelo` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `precio` decimal(12,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;