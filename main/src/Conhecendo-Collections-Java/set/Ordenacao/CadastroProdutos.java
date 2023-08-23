package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributo
    Set<Produto> produtoSet;

    //Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //Adicionar produtos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    
    //exibir produtos pelo nome
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> exibirPorNome = new TreeSet<>(produtoSet);
        if(!produtoSet.isEmpty()){
            return exibirPorNome;
        }
        else{
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    //exibir por preço
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> porPreco = new TreeSet<>(new ComparadorPorPreco());
        if(!produtoSet.isEmpty()){  
            porPreco.addAll(produtoSet);
            return porPreco;
        }
        else{
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(01, "Picole", 2, 10);
        produtos.adicionarProduto(02, "Danone", 5, 10);
        produtos.adicionarProduto(03, "Leite", 5.50, 10);
        produtos.adicionarProduto(04, "Paçoça", 1.50, 10);

        System.out.println(produtos.exibirProdutoPorNome()); 
        System.out.println("-------------------------------");
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
