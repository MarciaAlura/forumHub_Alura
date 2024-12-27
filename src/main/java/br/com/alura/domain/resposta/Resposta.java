package br.com.alura.domain.resposta;

import br.com.alura.domain.topico.Topico;
import br.com.alura.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "reposta")
@Entity(name = "Resposta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topico_id")
    private Topico topico;

    private LocalDateTime dataCriacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario usuario;

    private String solucao;

    public Long getId(){
        return id;
    }

    public String getMensagem(){
        return mensagem;
    }

    public Topico getTopico(){
        return topico;
    }

    public LocalDateTime getDataCriacao(){
        return dataCriacao;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public String getSolucao(){
        return solucao;
    }


}
