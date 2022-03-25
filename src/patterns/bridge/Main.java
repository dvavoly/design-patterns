package patterns.bridge;

public class Main {
    public static void main(String[] args) {
        new Peugeot(new Motorbike()).createVehicle();
        new Renault(new CarVehicle()).createVehicle();
    }
}
