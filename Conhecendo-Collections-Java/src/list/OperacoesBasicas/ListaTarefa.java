package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Criando uma lista com tarefa Atributo
    private List<Tarefa> tarefaList;

    //Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //Metodo adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //Metodo remover tarefa
    public void removertarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescrição().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //Metodo obter tarefa
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //Metodo para retornar lista contendo descrição de todas as tarefas na lista

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa tarefa = new ListaTarefa();
        
        System.out.println("Número de tarefas são: " + tarefa.obterNumeroTotalTarefas());
        tarefa.adicionarTarefa("Tarefa_1");
        tarefa.adicionarTarefa("Tarefa_1");
        tarefa.adicionarTarefa("Tarefa_2");

        tarefa.removertarefa("Tarefa_1");
        System.out.println("Número de tarefas são: " + tarefa.obterNumeroTotalTarefas());

        tarefa.obterDescricoesTarefas();
    }
}
