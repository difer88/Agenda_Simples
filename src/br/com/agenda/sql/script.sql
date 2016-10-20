create table Contato(
id_contato integer  primary key autoincrement,
nome varchar(100) not null,
data_nascimento varchar(10) not null,
telefone varchar(10) not null,
email varchar(50) not null);