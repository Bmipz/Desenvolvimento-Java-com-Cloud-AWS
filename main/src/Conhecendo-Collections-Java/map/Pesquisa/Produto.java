package map.Pesquisa;

public class Produto {
    //Atributo
    private String nome;
    private int quantidade;
    private double preco;

    //Construtor
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //método get
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    //método ToString
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

}
