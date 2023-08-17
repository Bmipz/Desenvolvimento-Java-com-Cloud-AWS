package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //Atributo
    List<Pessoa> pessoaList;

    //Construtor
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
     
    //Adicionar Pessoas
    public void adicionarPessoas(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Ordenar por idade
    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }
        else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    //Ordenar por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        }
        else{
            throw new RuntimeException("Lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoasList = new OrdenacaoPessoas(); 
        
        pessoasList.adicionarPessoas("Carlos", 28, 1.79);
        pessoasList.adicionarPessoas("Bruno", 25, 1.75);
        pessoasList.adicionarPessoas("Vanessa", 30, 1.55);
        pessoasList.adicionarPessoas("Larissa", 23, 1.65);

        System.out.println(pessoasList.ordernarPorIdade());
        System.out.println(pessoasList.ordenarPorAltura());
    }
}
