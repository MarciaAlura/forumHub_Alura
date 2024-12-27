package br.com.alura.domain.curso;

public record ListagemCurso(
        Long id,
        String nome,
        Categoria categoria) {

    public ListagemCurso(Curso curso) {
        this(curso.getId(),
                curso.getNome(),
                curso.getCategoria());
    }
}
