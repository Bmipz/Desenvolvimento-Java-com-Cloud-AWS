package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List <Livro> livrosList;

    //Construtor
    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    //Metodo para adicionar livros
    public void adicionarLivros(String titulo, String autor, int dataPublicacao){
        livrosList.add(new Livro(titulo, autor, dataPublicacao));
    }

    //metodo para buscar livros pelo autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro escolhido : livrosList){
                if(escolhido.getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.add(escolhido);
                }
            }
        }
        return livrosDoAutor;
    }

    //metodo pesquisa por intervalo de tempo
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro escolhido : livrosList){
                if(escolhido.getAnoPublicacao() >= anoInicial && escolhido.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(escolhido);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    //metodo pesquisar por titulo e retornar primeiro livro
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisadoTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro escolhido : livrosList){
                if(escolhido.getTitulo().equalsIgnoreCase(titulo)){
                   livroPesquisadoTitulo = escolhido;
                }
            }
        }
        return livroPesquisadoTitulo;
    }

    //Exibir lista de livros
    public void exibirLivros(List<Livro> livrolist){
        if(!livrolist.isEmpty()){
            for(Livro livros : livrolist){
                System.out.println("Titulo: " + livros.getTitulo());
                System.out.println("Autor: " + livros.getAutor());
                System.out.println("Data de lançamento: " + livros.getAnoPublicacao());
                System.out.println("------------------------------------------");
            }
        }
        else{
            System.out.println("Lista esta vazia");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros livroList = new CatalogoLivros();

        livroList.adicionarLivros("O corvo", "Edgar Allan Poe", 1845);
        livroList.adicionarLivros("Assassinatos na rua Morgue", "Edgar Allan Poe", 1841);
        livroList.adicionarLivros("O ladrão de raios", "Rick Riordan", 2005);

        livroList.exibirLivros(livroList.pesquisarPorAutor("Edgar Allan Poe"));
        System.out.println("------------------------------------"); 
        livroList.exibirLivros(livroList.pesquisarPorIntervaloAnos(1844, 2020));
        System.out.println("Livro pesquisado é: " + livroList.pesquisarPorTitulo("O ladrão de raios")); 
    }
}
