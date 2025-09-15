package Exercicios6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        Animal animals1 = new Animal("Ryuki","Gato");
        Animal animals2 = new Animal("Macaco","Primata");
        Animal animals3 = new Animal("Juliana","Cachorro");
        Animal animals4 = new Animal("Nicolau","Cachorro");
        Animal animals5 = new Animal("Simba","Gato");
        Animal animals6 = new Animal("Filomena","Gato");
        Animal animals7 = new Animal("Romeu","Gato");

        listOfAnimals.add(animals1);
        listOfAnimals.add(animals2);
        listOfAnimals.add(animals3);
        listOfAnimals.add(animals4);
        listOfAnimals.add(animals5);
        listOfAnimals.add(animals6);
        listOfAnimals.add(animals7);


        for (Animal animal : listOfAnimals){

            if (animal.getSpecie().equals("Gato")) {

                System.out.println("O animal de nome: " + animal.getName() + " é um " + animal.getSpecie());
            }
        }
    }
}

//if (animal.getSpecie().equals("Gato")) {
//    System.out.println("O animal de nome: " + animal.getName() + " e sua espécie é " + animal.getSpecie());
//}