package Exercicios10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Athlete> whoWillChampion = new ArrayList<>();

        Athlete champ1 = new Athlete("eric", "corredor", 18);
        Athlete champ2 = new Athlete("Eduardo", "Corredor", 8);
        Athlete champ3 = new Athlete("Josué", "Corredor", 14);
        Athlete champ4 = new Athlete("Lorenzo", "Corredor", 20);

        whoWillChampion.add(champ1);
        whoWillChampion.add(champ2);
        whoWillChampion.add(champ3);
        whoWillChampion.add(champ4);

        for (Athlete athlete : whoWillChampion) {

            if (athlete.getScore() == 20) {

                System.out.println("o atleta " + athlete.getName() + " de modalidade " + athlete.getModality() + " teve uma pontuação " + athlete.getScore());
            }
        }
    }
}

