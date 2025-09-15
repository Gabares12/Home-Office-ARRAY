package Exercicios4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> talvezAprovados = new ArrayList<>();

        Aluno aluno1 = new Aluno("jonas",7);
        Aluno aluno2 = new Aluno("joao", 4);
        Aluno aluno3 = new Aluno("pedro",6);
        Aluno aluno4 = new Aluno("Santiago",10);


        talvezAprovados.add(aluno1);
        talvezAprovados.add(aluno2);
        talvezAprovados.add(aluno3);
        talvezAprovados.add(aluno4);

        for (Aluno aluno :talvezAprovados ){

            if (aluno.getNota()  >= 7){
                System.out.println(aluno.getNome() + " foi aprovado: " + aluno.getNota());

            } else {
                System.out.println(aluno.getNome() + " não foi aprovado " + aluno.getNota());
            }



        }



    }
}



