package br.com.alura.controller;

import br.com.alura.domain.topico.CadastramentoTopico;
import br.com.alura.domain.topico.ControleDeTopicos;
import br.com.alura.domain.topico.DetalhamentoTopico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private ControleDeTopicos topico;

    public ResponseEntity agendar(@RequestBody @Valid DetalhamentoTopico dados){
        var dto =topico.cadastrar(dados);

        return ResponseEntity.ok(dto);
    }

}
