package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo
    Set <Contato> contatoAgenda;

    //Construtor
    public AgendaContatos() {
        this.contatoAgenda = new HashSet<>();
    }
    
    //Método para adicionar contato
    public void adicionarContato(String nome, int numero){
        contatoAgenda.add(new Contato(nome, numero));
    }

    //Método exibir Contatos
    public void exibirContatos(){
        if(!contatoAgenda.isEmpty()){
           System.out.println(contatoAgenda);
        }
        else{
            throw new RuntimeException("Agenda está vazia");
        }
    }

    //Método pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> procurado = new HashSet<>();
        if(!contatoAgenda.isEmpty()){
            for(Contato c : contatoAgenda){
                if(c.getNome().startsWith(nome)){
                    procurado.add(c);
                    break;
                } 
            }
            return procurado;
        }
        else{
            throw new RuntimeException("Agenda está vazia");
        }
    }

    //Método atualizar contatos
    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        if(!contatoAgenda.isEmpty()){
            for (Contato c : contatoAgenda){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(numero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        }
        else{
            throw new RuntimeException("Agenda está vazia");
        }
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Cleiton", 55555);
        contatos.adicionarContato("Cleiton Matias", 995566);
        contatos.adicionarContato("Gabriela", 995566);
        contatos.adicionarContato("Vanda", 988566);
        contatos.adicionarContato("Vanessa", 9116);

        contatos.exibirContatos();
         System.out.println(contatos.atualizarNumeroContato("Vanessa", 99999));
        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("Vanda"));
        contatos.exibirContatos(); 
    }
}
