package ro.fasttrackit.homework12.extramile;

public class Cars {
    private final CarList name;
    private final int age;
    private final int km;
    private final int price;

    public Cars(CarList name, int age, int km, int price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public CarList getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", age=" + age +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}