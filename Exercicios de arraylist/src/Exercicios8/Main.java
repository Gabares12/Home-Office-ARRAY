package Exercicios8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Recipe> recipes = new ArrayList<>();

        Recipe recipe1 = new Recipe("Bolo", 15);
        Recipe recipe2 = new Recipe("Brownie", 35);
        Recipe recipe3 = new Recipe("Nhoque com pesto",40);
        Recipe recipe4 = new Recipe("Macarrão", 8);
        Recipe recipe5 = new Recipe("Scargot",20);
        Recipe recipe6 = new Recipe("tonkatsu",35);

        recipes.add(recipe1);
        recipes.add(recipe2);
        recipes.add(recipe3);
        recipes.add(recipe4);
        recipes.add(recipe5);
        recipes.add(recipe6);

        //EX: for (Travel travel : travels)
        for (Recipe recipe : recipes ){

            if ( recipe .getPreparingTime() <= 30){

                System.out.println("A receita " + recipe.getName() + " dura aproximadamente " + recipe.getPreparingTime() + " Mintuos");

            }

        }
    }
}
