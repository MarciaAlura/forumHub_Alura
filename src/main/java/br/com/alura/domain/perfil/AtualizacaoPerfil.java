package br.com.alura.domain.perfil;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoPerfil(

        @NotNull
        Long id,
        String nome
) {
}
