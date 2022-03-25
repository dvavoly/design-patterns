package patterns.bridge;

public class Renault extends Manufacturer{

    public Renault(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void createVehicle() {
        System.out.println("Renault builds a car...");
        vehicle.drive();
    }
}
