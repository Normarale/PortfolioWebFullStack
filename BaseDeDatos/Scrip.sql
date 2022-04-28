DROP DATABASE IF exists DB_PORTFOLIO;
CREATE DATABASE DB_PORTFOLIO;
USE DB_PORTFOLIO;

CREATE TABLE usuarios
(id Integer not null auto_increment,
email varchar(30) not null,
password varchar(10) not null,
username varchar(30) not null,
PRIMARY KEY (id));

CREATE TABLE roles
(id Integer not null Primary key auto_increment,
nombre varchar(15) not null);

CREATE TABLE usuarios_has_roles
(user_id Integer not null ,
role_id Integer not null ,
  primary key(user_id, role_id));
  
  CREATE TABLE localidades
(id_localidad Integer not null auto_increment,
codigo_postal varchar(15) not null,
localidad varchar(20) not null,
PRIMARY KEY (id_localidad));
  
CREATE TABLE domicilios
(id_domicilio Integer not null auto_increment,
altura varchar(5) not null,
direccion varchar(10) not null,
localidad_id Integer not null,
PRIMARY KEY (id_domicilio),
FOREIGN KEY (localidad_id) REFERENCES localidades(id_localidad));

CREATE TABLE empleos
(id_empleo Integer not null auto_increment,
tipo varchar(15) not null,
PRIMARY KEY (id_empleo));

CREATE TABLE estudios
(id Integer not null auto_increment,
carrera varchar(20) not null,
fecha_desde varchar(15),
fecha_hasta varchar(15),
imagen varchar(30),
institucion varchar(40),
puntaje integer, 
titulo varchar(30),
PRIMARY KEY (id));

CREATE TABLE personas
(id Integer not null auto_increment,
apellido varchar(30) not null,
fecn_nacimiento varchar(15) not null,
img_background varchar(30),
img_perfil varchar(30),
nacionalidad varchar(20) not null,
nombre varchar(35) not null, 
ocupacion varchar(20),
sobremi varchar(50) not null,
domicilio_id integer,
PRIMARY KEY (id),
FOREIGN KEY (domicilio_id) REFERENCES domicilios(id_domicilio));

CREATE TABLE educacion_has_personas
(persona_id Integer not null ,
estudio_id Integer not null ,
  primary key(persona_id, estudio_id));

CREATE TABLE experiencias
(id Integer not null auto_increment,
descripcion varchar(20) not null,
fec_final varchar(15)not null,
fec_inicio varchar(15) not null,
nombre_empresa varchar(30) not null,
id_empleo integer not null,
id_persona integer not null, 
PRIMARY KEY (id),
FOREIGN KEY (id_empleo) REFERENCES empleos(id_empleo),
FOREIGN KEY (id_persona) REFERENCES personas (id));

CREATE TABLE proyectos
(id Integer not null auto_increment,
foto_url varchar(20) not null,
proyecto_desc varchar(30)not null,
id_persona integer not null, 
PRIMARY KEY (id),
FOREIGN KEY (id_persona) REFERENCES personas (id));

CREATE TABLE tecnologias
(id Integer not null Primary key auto_increment,
tecnologia varchar(30) not null);

CREATE TABLE proyectos_has_tecnologias
(proyecto_id Integer not null ,
tecnologia_id Integer not null ,
  primary key(proyecto_id, tecnologia_id));
  
  
  
   INSERT INTO localidades VALUES (1, "5137", "La Para"); 
   
 /*  otra forma*/
   
   INSERT INTO localidades (id_localidad, codigo_postal, localidad) VALUES (2, "5000", "Córdoba");
