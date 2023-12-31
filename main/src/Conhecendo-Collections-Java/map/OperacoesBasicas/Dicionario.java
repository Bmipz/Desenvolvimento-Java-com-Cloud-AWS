import java.util.HashMap;
import java.util.Map;

public class Dicionario {
   //Atributo
    private Map <String, String> palavraMap;

    //Construtor
    public Dicionario() {
        this.palavraMap = new HashMap<>();
    }

    //Adicionar palavras
    public void adicionarPalavra(String palavra, String definicao){
        palavraMap.put(palavra, definicao);
    }

    //removendo palavras pelo termo
    public void removerPalavra(String palavra){
        if(!palavraMap.isEmpty()){
            palavraMap.remove(palavra);
        }
    }
   
    //exibir palavras
    public void exibirPalavras(){
        if(!palavraMap.isEmpty()){
            System.out.println(palavraMap);
        }  
    }

    //pesquisar por palavra
    public String pesquisarPorPalavra(String palavra){
        return palavraMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("accelerator", "acelerador");
        dicionario.adicionarPalavra("Hello", "Olá");
        dicionario.adicionarPalavra("Name", "Nome");
        dicionario.adicionarPalavra("Money", "Dinheiro");

        dicionario.removerPalavra("accelerator");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Name"));
    }
}
