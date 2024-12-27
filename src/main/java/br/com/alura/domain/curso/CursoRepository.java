package br.com.alura.domain.curso;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {


    Page<Curso> findAllByAtivoTrue(Pageable paginacao);
}
