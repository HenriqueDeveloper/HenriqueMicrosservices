create table produto(
 id int primary key auto_increment not null,
 preco float not null,
 nome_produto varchar(30) not null,
 qtd_produto int not null,
 descricao varchar(100) not null
);

insert into produto (preco, nome_produto, qtd_produto, descricao)
values (2000, "tv", 2, "fsbfhh");
