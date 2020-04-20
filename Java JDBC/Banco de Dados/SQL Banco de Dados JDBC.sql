# Banco de Dados para JAVA
CREATE DATABASE dbloja
default character set utf8
default collate utf8_general_ci;

# Criando Tabela Categoria
CREATE TABLE Categoria 
(
	id int not null auto_increment ,
	descricao varchar(45) NOT NULL,
	primary key(id)
)default charset=utf8;

# Criando Tabela Produto
CREATE TABLE Produto
(
	id int not null auto_increment ,
	descricao varchar(100) NOT NULL,
    qtd int not null,
    valor float not null,
    categoria_id int not null,
	primary key(id),
    foreign key(categoria_id) references Categoria(id)
)default charset=utf8;


select * from categoria;
select * from produto;
