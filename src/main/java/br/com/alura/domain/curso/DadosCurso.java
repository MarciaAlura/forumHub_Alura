package br.com.alura.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCurso(

        @NotNull
        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotNull(message = "Categoria é obrigatória")
        Categoria categoria

) {
}
