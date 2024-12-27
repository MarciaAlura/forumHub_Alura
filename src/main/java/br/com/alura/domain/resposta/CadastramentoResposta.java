package br.com.alura.domain.resposta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CadastramentoResposta(

        Long id,
        String mensagem,

        @NotNull
        Long idTopico,

        @NotNull
        @Future
        LocalDateTime data,

        @NotNull
        Long idAutor,

        String solucao
) {
}
