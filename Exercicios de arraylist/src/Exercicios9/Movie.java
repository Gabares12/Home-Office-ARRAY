package Exercicios9;

public class Movie {

    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating){

        this.title = title;
        this.genre = genre;
        this.rating = rating;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }



}






//Crie uma classe Filme com os atributos titulo, genero e avaliacao.
//Adicione filmes à lista e imprima os com avaliação acima de 8.