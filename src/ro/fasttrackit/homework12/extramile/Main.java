package ro.fasttrackit.homework12.extramile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Car(CarMake.MAZDA, 12, 300000, 4000),
                new Car(CarMake.VOLVO, 2, 30000, 11000),
                new Car(CarMake.DACIA, 1, 300001, 40000),
                new Car(CarMake.FERARI, 3, 20000, 3000),
                new Car(CarMake.BMW, 10, 200000, 4200),
                new Car(CarMake.BMW, 3, 20000, 24200),
                new Car(CarMake.FERARI, 7, 20000, 14200)
        ));
        System.out.println(carShop.makeToAge() + "\n");
        System.out.println(carShop.makeToNumber()+ "\n");
        System.out.println(carShop.makeToKm()+ "\n");
        System.out.println(carShop.rangeToCars(10000)+ "\n");
        System.out.println(carShop.rangeToCars(1)+ "\n");
    }
}
