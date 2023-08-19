import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos
    private Map<String, Integer> contatos;

    //Construtor
    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    //Adicionar contato
    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    //remover um contato
    public void removerContato(String nome){
        if(!contatos.isEmpty()){
            contatos.remove(nome);
        }
    }

    //Exibir contatos
    public void exibirContatos(){
        System.out.println(contatos);
    }

    //pesquisar por nome
    public Integer pesquisarPorNome(String nome){
        Integer pesquisa = null;
        if(!contatos.isEmpty()){
            pesquisa = contatos.get(nome);
        }
        return pesquisa;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Ve", 1111555);
        agenda.adicionarContato("as", 1166655);
        agenda.adicionarContato("pok", 1999555);
        agenda.adicionarContato("Mi", 1000055);

        agenda.removerContato("pok");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Ve"));
    }
}
