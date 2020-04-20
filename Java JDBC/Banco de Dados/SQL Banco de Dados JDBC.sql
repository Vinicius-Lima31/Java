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

# Mostrando a Relação
# Usaremos essa Linha no NetBeans para Acessar!
select p.id as pid, p.descricao as pdesc, qtd, valor, categoria_id, c.id as cid, c.descricao as cdes from produto p inner join categoria c  on c.id = p.categoria_id;

# Usando um View
# Vamos em View -> Create View... -> 
# CREATE VIEW `vw_produtocategoria` AS select p.id as pid, p.descricao as pdesc, qtd, valor, categoria_id, c.id as cid, c.descricao as cdes from produto p inner join categoria c  on c.id = p.categoria_id; <--- Aqui dentro jogo todo SQL que eu quero nomear.

# Tou chamando essa Consulta de cima, que esta dentro dessa View
select * from vw_produtocategoria;