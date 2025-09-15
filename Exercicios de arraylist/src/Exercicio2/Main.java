package Exercicio2;

import java.util.ArrayList;

public class Main {public static void main(String[] args) {

    ArrayList<products> ProductList = new ArrayList<>();

    products products = new products("Perfume",84);
    products products1 = new products("Shampoo",16.90);
    products products2 = new products("Pão",40);

    ProductList.add(products);
    ProductList.add(products1);
    ProductList.add(products2);

    System.out.println("TAMANHO DA LISTA: " + ProductList.size());
    System.out.println("o produto mais caro é " + ProductList.get(0).getName());








}

}
