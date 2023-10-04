package Listas.ListaLivros;

public class Livro {

    //atributos
    private String titulo;
    private String autor;
    private int anoPulblicacao;

    public Livro(String titulo, String autor, int anoPulblicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPulblicacao = anoPulblicacao;
    };

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPulblicacao() {
        return anoPulblicacao;
    };

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPulblicacao=" + anoPulblicacao +
                '}';
    }
}
