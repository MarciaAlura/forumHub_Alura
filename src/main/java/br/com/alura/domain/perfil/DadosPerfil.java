package br.com.alura.domain.perfil;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosPerfil(

        @NotNull
        @NotBlank(message = "Nome é obrigatório")
        String nome

) {
}
