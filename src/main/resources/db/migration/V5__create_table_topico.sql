create table topico(

        id bigint not null auto_increment,
        titulo varchar(255) not null,
        mensagem varchar(255) not null,
        dataCriacao datetime not null,
        status varchar(100) not null,
        autor_id bigint not null unique,
        curso_id bigint not null unique,
        respostas_id bigint not null unique,

        primary key(id),
        constraint fk_topico_curso_id foreign key(curso_id) references curso(id),
        constraint fk_topico_autor_id foreign key(autor_id) references usuario(id),
        constraint fk_topico_respostas_id foreign key(respostas_id) references resposta(id)

);