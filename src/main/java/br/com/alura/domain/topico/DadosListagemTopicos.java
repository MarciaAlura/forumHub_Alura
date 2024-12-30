package br.com.alura.domain.topico;

import br.com.alura.domain.curso.Curso;
import br.com.alura.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosListagemTopicos(

        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        Usuario usuario,
        Curso curso) {

    public DadosListagemTopicos(Topico topico){

            this(topico.getId(),
                    topico.getTitulo(),
                    topico.getMensagem(),
                    topico.getDataCriacao(),
                    topico.getUsuario(),
                    topico.getCurso());
    }
}
