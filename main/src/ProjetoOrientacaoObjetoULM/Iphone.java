package ProjetoOrientacaoObjetoULM;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {

    //Reprodutor Musical
    public void pausar() {
        System.out.println("Pausar musica");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    //Aparelho telefonico
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciado correio de voz");
    }

    public void ligar() {
        System.out.println("Ligando para fulano");
    }

    //Navegador Internet
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }
    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        //testando reprodutormusical
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar();
        System.out.println("-------------------------");

        //Testando Aparelho telefonico
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.atender();
        System.out.println("-------------------------");
        
        //testando Navegador internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

    }
}
