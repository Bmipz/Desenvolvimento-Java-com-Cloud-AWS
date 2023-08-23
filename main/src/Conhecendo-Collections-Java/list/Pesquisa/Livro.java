package list.Pesquisa;

public class Livro {
    //Atributo
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //Caso exista um método que queria ver os livros
    @Override
    public String toString() {
        return "Livro [Titulo =" + titulo + ", Autor =" + autor + ", Ano de Publicacao =" + anoPublicacao + "]";
    }

    
    
}
