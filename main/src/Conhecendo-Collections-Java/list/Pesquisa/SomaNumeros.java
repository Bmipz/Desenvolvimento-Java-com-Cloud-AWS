package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributo
    private List <Integer> numeros;

    //construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }      

    //Adiciona um numero a lista
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    //calcular a soma de todos os numeros e retornar o valor
    public int CalcularSoma(){
        int soma = 0;
        for (Integer numero : numeros)
            soma+= numero;
        return soma;
    }

    //encontra numero maior
    public  int encontrarMaiorNumero(){
        int encontrado = 0;
        for (Integer numero : numeros){
            if(numero > encontrado){
                 encontrado = numero;
            } 
        }
        return encontrado;
    }

    //exibir numeros
    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println("Números que estão na lista são: " + numeros);
        }
        else{
            System.out.println("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "SomaNumeros [numeros=" + numeros + "]";
    }

    public static void main(String[] args) {
        SomaNumeros numeroList = new SomaNumeros();

        numeroList.adicionarNumero(10);
        numeroList.adicionarNumero(15);
        numeroList.adicionarNumero(6);
        numeroList.adicionarNumero(50);

        System.out.println("Maior número é: " + numeroList.encontrarMaiorNumero());
        System.out.println("A soma total é: " + numeroList.CalcularSoma());
        numeroList.exibirNumeros();
    }
}
