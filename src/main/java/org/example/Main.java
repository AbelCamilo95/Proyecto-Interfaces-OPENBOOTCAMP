package org.example;

public class Main {

    // implementacion de la interfaz
    static interfaceCarsCRUD carsCRUD = new CRUDCars();

    public static void main(String[] args) {

        Cars Lamborghini = new Cars("Centenario","Lamborghini","black",2,4000000.0);

        carsCRUD.addCar(Lamborghini);





    }
}