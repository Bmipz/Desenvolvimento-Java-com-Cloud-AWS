package list.OperacoesBasicas;

public class Item {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Item(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = estoque;
    }

    //Propriedades
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
}
