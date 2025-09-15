package Exercicios8;

public class Recipe {


    private String name;
    private Double preparingTime;

    public Recipe (String name , double preparingTime){

        this.name = name;
        this.preparingTime = preparingTime;
    }

    public String getName() {
        return name;
    }

    public Double getPreparingTime() {
        return preparingTime;
    }

    @Override
    public String toString() {
        return "está receita " + name + "dura " + preparingTime + "minutos";
    }
}
//Crie uma classe Receita com os atributos nome e tempoPreparo.
//Adicione receitas à lista e imprima as que levam menos de 30 minutos.



