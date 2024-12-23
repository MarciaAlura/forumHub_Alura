create table usuario(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    senha varchar(255) not null,
    perfis_id bigint not null unique,

    primary key(id),
    constraint fk_usuario_perfis_id foreign key(perfis_id) references perfis(id)
);
