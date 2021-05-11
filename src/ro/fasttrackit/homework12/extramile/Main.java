package ro.fasttrackit.homework12.extramile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Cars(CarList.MAZDA, 11, 300000, 4000),
                new Cars(CarList.VOLVO, 2, 30000, 11000),
                new Cars(CarList.DACIA, 1, 300001, 75000),
                new Cars(CarList.FERARI, 3, 20000, 100000),
                new Cars(CarList.BMW, 10, 200000, 3900),
                new Cars(CarList.BMW, 3, 20000, 24200),
                new Cars(CarList.FERARI, 1, 7000, 150000),
                new Cars(CarList.AUDI, 1, 62000, 45000),
                new Cars(CarList.VOLVO, 1, 55000, 17000),
                new Cars(CarList.FERARI, 1, 15000, 35000)
        ));
        System.out.println("\n" + "Each model car in the shop:" + carShop.carToNumber());
        System.out.println("\n" + "Car name to sum kilometers: " + carShop.carToKm());
        System.out.println("\n" + carShop.rangeToCar(15000));
        System.out.println("\n" + carShop.rangeToCar(1));
    }
}
