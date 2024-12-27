package br.com.alura.domain.curso;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoCurso(

        @NotNull
        Long id,
        String nome,
        Categoria categoria

) {
}
