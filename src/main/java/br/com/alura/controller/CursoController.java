package br.com.alura.controller;

import br.com.alura.domain.curso.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springdoc.core.converters.models.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.List;


@RestController
@RequestMapping("curso")
@SecurityRequirement(name = "bearer-key")
public class CursoController {

    @Autowired
    private CursoRepository repositorio;


    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCurso dados, UriComponentsBuilder uribuilder) {

        var curso = new Curso(dados);
        repositorio.save(curso);

        var uri = uribuilder.path("/curso/{id}").buildAndExpand(curso.getId()).toUri();

        return ResponseEntity.created(uri).body(new DetalhamentoCurso(curso));
    }


    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var curso = repositorio.getReferenceById(id);

        return ResponseEntity.ok(new DetalhamentoCurso(curso));
    }


    @GetMapping
    public ResponseEntity<Page<ListagemCurso>> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {

        var pagina = repositorio.findAllByAtivoTrue(paginacao).map(ListagemCurso::new);

        return ResponseEntity.ok(pagina);
    }
}
