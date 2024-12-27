package br.com.alura.domain.curso;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "curso")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public Curso(DadosCurso dadosCurso) {

        this.nome = dadosCurso.nome();
        this.categoria = dadosCurso.categoria();

    }

    public void atualizarInformacoes(@Valid AtualizacaoCurso dados){

        if (dados.nome() != null) {
            this.nome = dados.nome();
        }

    }

}
