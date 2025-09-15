package Exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


                    //listaDeLivros
        ArrayList<Book> booklist = new ArrayList<>();


        Book bookOne = new Book("Volta ao mundo em 80 dias", "Jules verne",1880);
        Book bookTwo = new Book("20 mil léguas Submarinas","Jules Verne",1870 );
        Book bookThree = new Book("O nevoeiro ", "Sthephen king",2011);
        Book bookFour = new Book("Os Ventos do inverno ", "George R R Martin", 2027);


        booklist.add(bookOne);
        booklist.add(bookTwo);
        booklist.add(bookThree);
        booklist.add(bookFour);

        System.out.println("LISTA COMPLETA " + booklist);
        System.out.println("TAMANHO DA LISTA: " + booklist.size());
        System.out.println("---------------------------------");
        System.out.println("Livros pós 2010: " + booklist.get(2) + booklist.get(3));

    }
}
