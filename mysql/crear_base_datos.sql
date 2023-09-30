-- Crear la base de datos
CREATE DATABASE hotel;

-- Crear la tabla de usuarios
CREATE TABLE usuarios (
  id INT NOT NULL AUTO_INCREMENT,
  nombre_usuario VARCHAR(255) NOT NULL,
  contrasena VARCHAR(255) NOT NULL,
  rol VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

-- Crear la tabla de reservas
CREATE TABLE reservas (
  id INT NOT NULL AUTO_INCREMENT,
  nombre_cliente VARCHAR(255) NOT NULL,
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE NOT NULL,
  habitacion VARCHAR(255) NOT NULL,
  valor DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (id)
);

-- Crear la tabla de huéspedes
CREATE TABLE huespedes (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) NOT NULL,
  apellido VARCHAR(255) NOT NULL,
  numero_identificacion VARCHAR(255) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  PRIMARY KEY (id)
);
