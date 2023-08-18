package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListasTarefas {
    //Atributos
    Set <Tarefa> tarefaSet;

    //Construtor
    public ListasTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    
    //Método adicionar diferente de outras vezes, objeto será criado no método main
    public void adicionarTarefa(Tarefa tarefa){
        tarefaSet.add(tarefa);
    }

    //Métod remover tarefa
    public void removerTarefa(String descricao){
        Tarefa removerTarefa = null;
        Boolean encontrado = false;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    removerTarefa = t;
                    encontrado = true;
                    break;
                }
            }
            tarefaSet.remove(removerTarefa);
            if(!encontrado){
                System.out.println("Impossível remover está tarefa pois ela não existe");
            }
        }
        else{
            System.out.println("A lista de tarefas está vazia");
        }
    }

    //Metodo para exibir
    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }
        else{
            System.out.println("Não existe nenhuma tarefa");
        }
    }

    //Método contar tarefas
    public int contarTarefas(){
        return tarefaSet.size();
    }

    //Método obter tarefas concluidas
    public Set<Tarefa> obterTarefaConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        Boolean concluidas = false;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getConcluida()){
                    tarefasConcluidas.add(t);
                    concluidas = true;
                }
            }
            if(!concluidas){
                System.out.println("Nenhuma tarefa concluída");
            }
            return tarefasConcluidas;
        }
        else{
            throw new RuntimeException("A lista de tarefas está vazia");
        }
    }

    //Método obter tarefas pendentes
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        Boolean pendente = false;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(!t.getConcluida()){
                    tarefasPendentes.add(t);
                    pendente = true;
                }
            }
            if(!pendente){
                System.out.println("Nenhuma tarefa pendente");
            }
            return tarefasPendentes;
        }
        else{
            throw new RuntimeException("A lista de tarefas está vazia");
        }
    }

    //Método para marcar como concluídas pela descrição
    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            boolean existe = false;
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    existe = true;
                    break;
                }
            }
            if(!existe){
                System.out.println("Não encontrado");
            }
        }
        else{
            System.out.println("Lista está vazia");
        }
    }

    //Método para marcar como concluídas pela descrição
    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            boolean existe = false;
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    existe = true;
                    break;
                }
            }
            if(!existe){
                System.out.println("Não encontrado");
            }
        }
        else{
            System.out.println("Lista está vazia");
        }
    }

    //Método limpar todas as tarefas
    public void limparTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListasTarefas listinha = new ListasTarefas();

        Tarefa correr = new Tarefa("Correr", false);
        listinha.adicionarTarefa(correr);

        Tarefa estudar = new Tarefa("Estudar", false);
        listinha.adicionarTarefa(estudar);

        Tarefa dormir = new Tarefa("Dormir", false);
        listinha.adicionarTarefa(dormir);
        listinha.removerTarefa("Nadar");
        System.out.println("-----------------------");

        listinha.exibirTarefas();
        System.out.println("Exibir tarefas existentes: " + listinha.contarTarefas()); 
        System.out.println("-----------------------");

        System.out.println("Tarefas concluídas: " + listinha.obterTarefaConcluidas());
        System.out.println("-----------------------");

        System.out.println("Tarefas pendentes: " + listinha.obterTarefasPendentes());

        System.out.println("-----------------------");
        listinha.marcarTarefaConcluida("Estudar");
        listinha.exibirTarefas();

        System.out.println("-----------------------");
        listinha.marcarTarefaPendente("Estudar");
        listinha.exibirTarefas();

        System.out.println("-----------------------");
        listinha.limparTarefas();
        listinha.exibirTarefas();
    }
}
