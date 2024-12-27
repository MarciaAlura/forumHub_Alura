package br.com.alura.domain.perfil;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name = "perfil")
@Entity(name = "Perfil")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Perfil  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Perfil(DadosPerfil dadosPerfil){

        this.nome = dadosPerfil.nome();

    }

    public void atualizarInformacoes(@Valid AtualizacaoPerfil dados){

        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
    }

}
