package patterns.bridge;

public class Peugeot extends Manufacturer{

    public Peugeot(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void createVehicle() {
        System.out.println("Peugeot builds a car... ");
        vehicle.drive();
    }
}
