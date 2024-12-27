package br.com.alura.domain.curso;

public record DetalhamentoCurso(

        Long id,
        String nome,
        Categoria categoria)
{

    public DetalhamentoCurso(Curso curso) {
        this(curso.getId(),
                curso.getNome(),
                curso.getCategoria());
    }
}
