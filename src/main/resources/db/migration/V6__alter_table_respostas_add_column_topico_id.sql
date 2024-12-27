alter table resposta drop column topico;
alter table resposta add column topico_id bigint not null unique;

