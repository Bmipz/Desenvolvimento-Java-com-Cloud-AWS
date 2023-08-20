package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributo
    private Map <String, Integer> palavras;

    //Construtor
    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    //adicionar palavra 
    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    //removendo palavra
    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    //exibir contagem de palavras
    public void exibirContagemPalavras(){
        if(!palavras.isEmpty()){
            System.out.println(palavras);
        }
        else{
            System.out.println("Map vazio");
        }
    }

    //encontrar a palavra maior contagem
    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){
        Map.Entry<String, Integer> palavraFrequente = null;
        int maiorContagem = 0;
        if(!palavras.isEmpty()){
           for (Map.Entry<String, Integer> e : palavras.entrySet()) {
                if(e.getValue() > maiorContagem){
                    maiorContagem = e.getValue();
                    palavraFrequente = e;
                }
           }
           return palavraFrequente;
        }
        else{
            throw new RuntimeException("Map vazio");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contadorPalavras = new ContagemPalavras();

        contadorPalavras.adicionarPalavra("Teste", 01);
        contadorPalavras.adicionarPalavra("Configurando", 07);
        contadorPalavras.adicionarPalavra("Carro", 05);
        contadorPalavras.adicionarPalavra("Erro", 02);

        contadorPalavras.removerPalavra("Configurando");
        contadorPalavras.exibirContagemPalavras();
        System.out.println(contadorPalavras.encontrarPalavraMaisFrequente()); 
    }
}
