package Exercicios10;

public class Athlete {

    private String name;
    private String modality;
    private int score;

    public Athlete(String name, String modality , int score){

        this.name = name;
        this.modality = modality;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getModality() {
        return modality;
    }

    public int getScore() {
        return score;
    }
}
