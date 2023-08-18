package set.Ordenacao;

import java.util.Comparator;

public class Aluno  implements Comparable<Aluno> {
    //Atributos
    private String nome;
    private long matricula;
    private int nota;
    
    //Construtor
    public Aluno(String nome, long matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Método get
    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public int getNota() {
        return nota;
    }

    //Método ToString
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
    }

    //hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class ComparadorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
