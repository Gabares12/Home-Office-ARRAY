package Exercicios7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Travel> travels = new ArrayList<>();

        Travel travels1 = new Travel("Japão", 3);
        Travel travels2 = new Travel("Australia", 160);
        Travel travels3 = new Travel("Babaçulandia(TO)", 2);
        Travel travels4 = new Travel("Tuvalu", 5);
        Travel travels5 = new Travel("Polonia", 77);

        travels.add(travels1);
        travels.add(travels2);
        travels.add(travels3);
        travels.add(travels4);
        travels.add(travels5);


        for (Travel travel : travels) {

            if (travel.getDayDuration() >= 7) {

                System.out.println("essa viagem para " + travel.getDestiny() + " dura " + travel.getDayDuration() + " dias");

            }
        }
    }
}
