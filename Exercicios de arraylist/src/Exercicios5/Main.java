package Exercicios5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cars> listCars = new ArrayList<>();

        Cars car1 = new Cars("Fiat","Preto",2003);
        Cars car2 = new Cars("Porsche","Amarelo",2010);
        Cars car3 = new Cars("Onix","prata",2013);
        Cars car4 = new Cars("Parati","Vermelho",1983);
        Cars car5 = new Cars("Peuget","Vermelho",2008);

        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);


        for (Cars cars : listCars) {
            //.equals() usado para comparar String
            if (cars.getColor().equals("Vermelho")) {

                System.out.println(" O veiculo: " + cars.getModel() + " é definitivamente " + cars.getColor() );
            }

        }
    }
}
