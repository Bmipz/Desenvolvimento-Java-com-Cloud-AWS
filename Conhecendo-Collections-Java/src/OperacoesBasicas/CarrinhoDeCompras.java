package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo
    private List <Item> itemLista; 
     
    //Construtor
    public CarrinhoDeCompras() {
        this.itemLista = new ArrayList<>();
    }

    //Metodo adicionar itens
    public void adicionarItem(String nome, double preco, int quantidade){
        itemLista.add(new Item(nome, preco, quantidade));
    }

    //metodo para remover itens
    public void removerItem(String nome){
        List <Item> itemParaRemover = new ArrayList<>(); 
        for (Item escolhidos : itemLista){
            if(escolhidos.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(escolhidos);
            }
        }
        itemLista.removeAll(itemParaRemover);
    }

    //Calcula e retorna o valor do carrinho
    public double calcularValorTotal(){
        double saldoCarrinho = 0;
        for (Item escolhidos : itemLista){
            saldoCarrinho += escolhidos.getPreco() * escolhidos.getQuantidade();
        }
        return saldoCarrinho;
    }

    //Metodo exibir todos itens
    public void exibirItens(){
        for (Item escolhido : itemLista){
            System.out.println("-------------------------------------------");
            System.out.println("Produto: " + escolhido.getNome());
            System.out.println("Preço: " + escolhido.getPreco());
            System.out.println("Quantidade: " + escolhido.getQuantidade());
            System.out.println("-------------------------------------------");
        }
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Bala", 0.20, 10);
        carrinho.adicionarItem("Banana", 3.00, 5);
        carrinho.adicionarItem("Chocolate", 5, 6);

        System.out.println("-------------------------------------------");
        System.out.println("O valor do carrinho está em: " + carrinho.calcularValorTotal());
        System.out.println("-------------------------------------------");

        carrinho.removerItem("Banana");

        System.out.println("-------------------------------------------");
        System.out.println("O valor do carrinho está em: " + carrinho.calcularValorTotal());
        System.out.println("-------------------------------------------");

        carrinho.exibirItens();
    }
}    
