package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atribrutos
    Set <Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Método para adicionar convidado
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    //Método para remover convidado pelo codigo convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoSaiu = null;
        if(!convidadoSet.isEmpty()){
            for (Convidado c : convidadoSet){
                if(c.getCodigoConvite() == codigoConvite){
                    convidadoSaiu = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoSaiu);
        }
        else{
            System.out.println("Não existe nenhum convidado com este código");
        }
    }

    //Método contar convidados
    public void contarConvidados(){
        System.out.println("O número de convidados é " + convidadoSet.size());
    }

    //Método exibir todos os convidados
    public void exibirConvidados(){
        if(!convidadoSet.isEmpty()){
            for (Convidado c : convidadoSet){
            System.out.println("-----------------------");
            System.out.println("Nome do convidado: " + c.getNome());
            System.out.println("Código do convidado: " + c.getCodigoConvite());
            }
        }
        else{
            System.out.println("Conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidadosSet = new ConjuntoConvidados();

        conjuntoConvidadosSet.adicionarConvidado("Marcelo", 15236);
        conjuntoConvidadosSet.adicionarConvidado("Larissa", 15290);
        conjuntoConvidadosSet.adicionarConvidado("Maicon", 15876);
        conjuntoConvidadosSet.adicionarConvidado("Espiao", 15876);
        conjuntoConvidadosSet.adicionarConvidado("Manuela", 13236);

        conjuntoConvidadosSet.removerConvidadoPorCodigoConvite(15290);

        conjuntoConvidadosSet.contarConvidados();

        conjuntoConvidadosSet.exibirConvidados();
    }
}
