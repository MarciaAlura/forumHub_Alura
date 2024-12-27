package br.com.alura.domain.topico;

import br.com.alura.domain.curso.Curso;
import br.com.alura.domain.resposta.Resposta;
import br.com.alura.domain.usuario.Usuario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    private LocalDateTime dataCriacao;

    private String Status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resposta_id")
    private Resposta resposta;


}
