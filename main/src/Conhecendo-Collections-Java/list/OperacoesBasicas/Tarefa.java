package list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descrição = "";

    //Propriedade get
    public String getDescrição() {
        return descrição;
    }

    //construtor
    public Tarefa(String descrição) {
        this.descrição = descrição;
    }

    //to String
    @Override
    public String toString() {
        return "Tarefa [descrição=" + descrição + "]";
    }

}
