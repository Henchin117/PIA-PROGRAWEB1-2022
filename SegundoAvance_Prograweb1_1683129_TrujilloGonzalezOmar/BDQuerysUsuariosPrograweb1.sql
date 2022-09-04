CREATE DATABASE PROGRA_WEB1;

USE PROGRA_WEB1;

DROP TABLE Usuarios;

CREATE TABLE Usuarios(
ID int not null auto_increment,
Nombre varchar (20) not null, 
ApellidoP varchar (20) not null,
ApellidoM varchar (20) not null,
Fecha_Nacimiento date not null,
Correo varchar (20) not null,
NombreUsuario varchar (20) not null,
Contra varchar (20) not null,
Fecha_Creacion datetime,
Eliminado bool not null default (0),
primary key (ID)
);

INSERT INTO Usuarios (Nombre, ApellidoP, ApellidoM, Fecha_Nacimiento, Correo, NombreUsuario, Contra) 
VALUES ("Omar","Trujillo","Gonzalez","1997/09/30","omargzz117@gmail.com","Henchin117","Henchin117!");
Select * from Usuarios;

drop table Notas;
CREATE TABLE Notas(
ID_User int not null,
ID int not null auto_increment,
Titulo varchar(50),
Texto varchar(150) not null,
Fecha_Creacion datetime,
hashtag varchar(20),
Eliminado bool not null default (0),

PRIMARY KEY(ID),
 FOREIGN KEY (ID_User) REFERENCES Usuarios(ID)
);
