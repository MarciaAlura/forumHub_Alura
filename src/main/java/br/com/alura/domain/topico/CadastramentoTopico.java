package br.com.alura.domain.topico;

import br.com.alura.domain.curso.CursoRepository;
import br.com.alura.domain.usuario.UsuarioRepository;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record CadastramentoTopico(

        Long id,

        @NotNull
        String titulo,

        @NotNull
        String mensagem,

        @NotNull
        @Future
        LocalDateTime data,

        @NotNull
        String status,

        @NotNull
        Long idAutor,

        @NotNull
        Long idCurso,

        @NotNull
        Long idResposta
) {

}
