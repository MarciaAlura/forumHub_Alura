package br.com.alura.domain.topico;

import br.com.alura.domain.curso.Curso;
import br.com.alura.domain.curso.CursoRepository;
import br.com.alura.domain.resposta.RespostaRepository;
import br.com.alura.domain.usuario.Usuario;
import br.com.alura.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ControleDeTopicos {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private RespostaRepository respostaRepository;


    public ControleDeTopicos cadastrar(DetalhamentoTopico dados){

    var curso = cursoRepository.findById(dados.idCurso()).get();
    var usuario = usuarioRepository.findById(dados.idAutor()).get();

     var dataCricao = LocalDateTime.now();
     
     var titulo = dados.titulo();
     var mensagem = dados.mensagem();

     var topico =new Topico(titulo, mensagem, dataCricao,null,  usuario, curso);

     topicoRepository.save(topico);

     return new ControleDeTopicos();

    }
}
