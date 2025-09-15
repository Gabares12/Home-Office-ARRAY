package Exercicios9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Movie> listOfMovies = new ArrayList<>();

        Movie movie1 = new Movie("Taxi Driver","Drama",8);
        Movie movie2 = new Movie("Os Bons companheiros","Drama",9);
        Movie movie3 = new Movie("Indiana jones","Ação",10);
        Movie movie4 = new Movie("Os Bad Boys","Ação",8);
        Movie movie5 = new Movie("Interestelar", "Ficção Cientifica",10);
        Movie movie6 = new Movie("Coringa 2","Drama",3);

        listOfMovies.add(movie1);
        listOfMovies.add(movie2);
        listOfMovies.add(movie3);
        listOfMovies.add(movie4);
        listOfMovies.add(movie5);
        listOfMovies.add(movie6);

        for (Movie movie : listOfMovies){
            if (movie.getRating() >= 8){

                System.out.println("A nota do Filme " + movie.getTitle() + " tem nota : " + movie.getRating() );
            }
        }



    }
}


//Crie uma classe Filme com os atributos titulo, genero e avaliacao.
//Adicione filmes à lista e imprima os com avaliação acima de 8.
