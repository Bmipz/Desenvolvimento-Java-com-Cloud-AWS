package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    //Atributo
    List<Integer> numerosList;

    //Construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    //Metodo comparable
    @Override
    public int compareTo(Integer i) {
        return Integer.compare(i,i);
    }

    //Adicionar um número a lista
    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    //ordenar por ascendente
    public List<Integer> ordenarAscendente(){
        List<Integer> ordenadosAscendetes = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(ordenadosAscendetes);
            return ordenadosAscendetes;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
        
    }

    //ordenar descendente
    public List<Integer> ordenarDescendente(){
        List<Integer> ordenadosAscendetes = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            ordenadosAscendetes.sort(Collections.reverseOrder());
            return ordenadosAscendetes;
        }
        else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    //ToString
    @Override
    public String toString() {
        return "OrdenacaoNumeros [numerosList=" + numerosList + "]";
    }

    public static void main(String[] args) {
        OrdenacaoNumeros oNumeros = new OrdenacaoNumeros();
        
        oNumeros.adicionarNumero(10);
        oNumeros.adicionarNumero(6);
        oNumeros.adicionarNumero(19);
        oNumeros.adicionarNumero(25);
        oNumeros.adicionarNumero(40);
        
        System.out.println(oNumeros.ordenarAscendente());
        System.out.println(oNumeros.ordenarDescendente());
    }
}