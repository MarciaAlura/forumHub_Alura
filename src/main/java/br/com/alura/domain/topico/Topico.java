package br.com.alura.domain.topico;

import br.com.alura.domain.curso.Curso;
import br.com.alura.domain.resposta.Resposta;
import br.com.alura.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;

import java.lang.annotation.Repeatable;
import java.time.LocalDateTime;

public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    private LocalDateTime dataCriacao;

    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resposta_id")
    private Resposta resposta;

    public Topico(String titulo, String mensagem, LocalDateTime data, String staus, Usuario usuario, Curso curso) {
    }

    public Long getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String  getMensagem(){
        return mensagem;
    }

    public LocalDateTime getDataCriacao(){
        return dataCriacao;
    }

    public String getStatus(){
        return status;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public Curso getCurso(){
        return curso;
    }

    public Resposta getResposta(){
        return resposta;
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoTopicos dados) {

        if(dados.titulo() != null){
            this.titulo=dados.titulo();
        }

        if(dados.mensagem() != null){
            this.mensagem=dados.mensagem();
        }
    }
}
