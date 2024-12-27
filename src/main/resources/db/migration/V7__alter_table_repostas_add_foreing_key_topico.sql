ALTER TABLE resposta
ADD CONSTRAINT fk_resposta_topico_id foreign key(topico_id) references topico(respostas_id);