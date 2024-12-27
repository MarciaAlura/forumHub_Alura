package br.com.alura.domain.topico;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CadastramentoTopico(

        Long id,
        String titulo,
        String mensagem,

        @NotNull
        @Future
        LocalDateTime data,

        String status,

        @NotNull
        Long idAutor,

        @NotNull
        Long idCurso,

        @NotNull
        Long idResposta
) {
}
