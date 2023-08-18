package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributo
    Set<Aluno> alunoSet;

    //Método construtor
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    
    //Adicionar alunos
    public void adicionarAlunos(String nome, long matricula, int nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    //Remover aluno
    public void removerAluno(long matricula){
        if(!alunoSet.isEmpty()){ 
            Aluno removerAluno = null;
            for (Aluno aluno : alunoSet) {
                if(aluno.getMatricula() == matricula){
                    removerAluno = aluno;
                    break;
                }
            }
            alunoSet.remove(removerAluno);
        }
        else{
            throw new RuntimeException("Conjunto está vazio");
        }
    }

    //exibir alunos por ordem alfabética
    public void exibirAlunosPorNome(){
        if(!alunoSet.isEmpty()){
            Set<Aluno> ordemAlfabetica = new TreeSet<>();
        ordemAlfabetica.addAll(alunoSet);
        System.out.println(ordemAlfabetica);
        }
        else{
            System.out.println("COnjunto está vazio");
        }
    }

    //exibir aluno por nota
    public void exibirAlunosPorNota(){
        if(!alunoSet.isEmpty()){
            Set<Aluno> ordemNota = new TreeSet<>(new ComparadorNota()); 
            ordemNota.addAll(alunoSet);
            System.out.println(ordemNota);
        }
        else{
            System.out.println("COnjunto está vazio");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAlunos("Pedrin", 1022554, 7);
        alunos.adicionarAlunos("Joazinho", 1022570, 6);
        alunos.adicionarAlunos("Carlinho", 1156554, 10);
        alunos.adicionarAlunos("Maria", 199954, 9);

        alunos.removerAluno(1022570);
        alunos.exibirAlunosPorNome();
        alunos.exibirAlunosPorNota();

    }
}
