package patterns.template;

public class Main {
    public static void main(String[] args) {
        CarTemplate firstCar = new ElectricCar();
        CarTemplate secondCar = new MuscleCar();

        firstCar.carParts();
        System.out.println();
        secondCar.carParts();
    }
}
