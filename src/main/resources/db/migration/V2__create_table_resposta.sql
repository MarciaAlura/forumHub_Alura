create table resposta(

        id bigint not null auto_increment,
        mensagem varchar(255) not null,
        topico varchar(255) not null,
        dataCriacao datetime not null,
        autor_id  bigint not null unique,
        solucao varchar(255) not null,


        primary key(id)
);