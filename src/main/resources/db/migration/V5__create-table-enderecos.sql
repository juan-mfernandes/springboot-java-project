create table enderecos (
    id int not null primary key auto_increment,
    logradouro varchar(200),
    cidade varchar(200),
    cliente_id int not null,
    foreign key (cliente_id) references clientes(id)
);