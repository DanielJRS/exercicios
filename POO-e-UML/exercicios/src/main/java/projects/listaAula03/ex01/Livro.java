package projects.listaAula03.ex01;

/*
* 1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas.
* Adicione métodos para abrir o livro e ler uma página.
*/

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrir() {
        this.paginaAtual = 1;
        System.out.println("Livro aberto na página " + this.paginaAtual);
    }

    public void lerPagina() {
        if (this.paginaAtual > 0 && this.paginaAtual <= this.numeroDePaginas) {
            System.out.println("Lendo página " + this.paginaAtual);
            this.paginaAtual++;
        } else {
            System.out.println("Não há mais páginas para ler.");
        }
    }

    // Getters e Setters (opcional)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}




