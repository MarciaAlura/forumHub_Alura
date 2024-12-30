package br.com.alura.domain.topico;

import br.com.alura.domain.curso.CursoRepository;
import br.com.alura.domain.usuario.UsuarioRepository;

import java.time.LocalDateTime;

public record DetalhamentoTopico(

    Long id,
    String titulo,
    String mensagem,
    LocalDateTime data,
    String status,
    Long idAutor,
    Long idCurso,
    Long idRespostas
) {


    public DetalhamentoTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getUsuario().getId(),
                topico.getCurso().getId(),
                topico.getResposta().getId()
                );

    }


}
