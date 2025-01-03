package br.com.alura.controller;

import br.com.alura.domain.topico.CadastramentoTopico;
import br.com.alura.domain.topico.ControleDeTopicos;
import br.com.alura.domain.topico.DetalhamentoTopico;
import br.com.alura.domain.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private ControleDeTopicos topico;

    private TopicoRepository topicoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity registrar(@RequestBody @Valid DetalhamentoTopico dados){
        var dto =topico.cadastrar(dados);

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){

        var tp = topicoRepository.getReferenceById(id);
        return ResponseEntity.ok(new DetalhamentoTopico(tp));

    }

}
