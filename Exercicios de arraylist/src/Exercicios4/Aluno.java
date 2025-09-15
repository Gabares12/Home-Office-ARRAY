package Exercicios4;

public class Aluno {

    private String nome;
    public double nota;

    public Aluno (String nome , int nota ){

        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}
