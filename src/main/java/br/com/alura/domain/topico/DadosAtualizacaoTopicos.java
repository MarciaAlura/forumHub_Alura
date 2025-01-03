package br.com.alura.domain.topico;

import br.com.alura.domain.curso.Curso;
import br.com.alura.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopicos(
        @NotNull
        Long id,

        @NotNull
        String titulo,

        @NotNull
        String mensagem,
        LocalDateTime dataCriacao,

        @NotNull
        Usuario usuario,

        @NotNull
        Curso curso
) {


}
