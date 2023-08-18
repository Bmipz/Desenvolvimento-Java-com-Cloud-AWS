package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
   //Atributo
    Set <String> palavrasUnicas;

    //Construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }
   
    //Método para adicionar uma palavras ao conjunto
    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(new String(palavra));
    }
   
    //Método para remover uma palavra
    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            palavrasUnicas.remove(palavra);
        }
        else{
            System.out.println("Conjunto esta vazio");
        }
    }

    //verifica se acha uma palavra
    public Boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    //Exibir todas as palavras
    public void exibirPalavrasUnicas(){
        if(!palavrasUnicas.isEmpty()){
             for(String s : palavrasUnicas){
            System.out.println(s);
        }
        }
        else{
            System.out.println("Conjunto esta vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Hello");
        palavrasUnicas.adicionarPalavra("World");
        palavrasUnicas.adicionarPalavra("Java");
        palavrasUnicas.adicionarPalavra("Divertido");

        palavrasUnicas.exibirPalavrasUnicas();

        System.out.println("----------------------");
        palavrasUnicas.removerPalavra("Hello");

        palavrasUnicas.exibirPalavrasUnicas();
    }
}
