package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    Map<Long, Produto> estoqueMap;

    public EstoqueProduto() {
        this.estoqueMap = new HashMap<>();
    }

    //Adicionar produto
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto (nome, quantidade, preco));
    }

    //Exibir produto
    public void exibirProdutos(){
        if(!estoqueMap.isEmpty()){
            System.out.println(estoqueMap);
        }
        else{
            System.out.println("Estoque vazio");
        }
    }

    //calcular valor total do estoque
    public double calcularValorTotalEstoque(){
        double total = 0;
        if(!estoqueMap.isEmpty()){
            for (Produto produto : estoqueMap.values()) {
                total += produto.getPreco() * produto.getQuantidade();
            }
            return total;
        }
        else{
            throw new RuntimeException("Map vazio");
        }
    }

    //retorna o produto mais caro
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maisCaro = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()){
            for (Produto produto : estoqueMap.values()) {
                if(produto.getPreco() > maisCaro){
                    maisCaro = produto.getPreco();
                    produtoMaisCaro = produto;
                } 
            }
            return produtoMaisCaro;
        }
        else{
            throw new RuntimeException("Map vazio");
        }
    }

    //obter produto mais barato
    public Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        double comparador = Double.MAX_VALUE;
        if(!estoqueMap.isEmpty()){
            for (Produto produto : estoqueMap.values()) {
                if(produto.getPreco() < comparador){
                    comparador = produto.getPreco();
                    maisBarato = produto;
                } 
            }
            return maisBarato;
        }
        else{
            throw new RuntimeException("Map vazio");
        }
    }

    //Produto mais caro contando com quantidade do estoque
    public Produto obterProdutoMaiorQuantidadeDeValorTotalNoEstoque(){
        Produto produtoMaisCaro = null;
        double maisCaro = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()){
            for (Produto produto : estoqueMap.values()) {
                if((produto.getPreco() * produto.getQuantidade()) > maisCaro){
                    maisCaro = produto.getPreco() * produto.getQuantidade();
                    produtoMaisCaro = produto;
                } 
            }
            return produtoMaisCaro;
        }
        else{
            throw new RuntimeException("Map vazio");
        }
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.adicionarProduto(12, "Bis", 3, 5);
        estoque.adicionarProduto(13, "Halls", 20, 3);
        estoque.adicionarProduto(18, "Barra", 2, 11.20);
        estoque.adicionarProduto(120, "Trident", 16, 3);

        estoque.exibirProdutos();
        System.out.println("Valor do estoque é: " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " +estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro contando com estoque: " +estoque.obterProdutoMaiorQuantidadeDeValorTotalNoEstoque());
    }
}
