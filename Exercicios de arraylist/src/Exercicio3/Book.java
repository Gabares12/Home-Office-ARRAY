package Exercicio3;

public class Book {

    private String title;
    private String author;
    private int yearPublished;


    public Book(String title, String author, int yearPublished ){

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    @Override
    public String toString() {
        return "\n Livro: " + title + "\n Autor(a): " + author + "\n ANO DE LANÇAMENTO: " + "("+ yearPublished + ")";
    }
}
