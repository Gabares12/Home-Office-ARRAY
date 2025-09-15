package Exercicios6;

public class Animal {

    private String name;
    private String specie;


    public Animal(String name, String specie){

        this.name = name;
        this.specie = specie;


    }


    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    @Override
    public String toString() {
        return "O animal de nome: " + name + "e é um " + specie;
    }
}
