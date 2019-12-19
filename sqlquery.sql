create table alunos (
ra int not null PRIMARY KEY,
nome varchar(50)not null,
email varchar(100)not null
)

CREATE TABLE materia
(
codigo int not null,
nome varchar(50)
)

CREATE TABLE fezz
(
ra int not null,
cod int not null,
nota float not null,
frequencia float not null
primary key(ra,cod)
)