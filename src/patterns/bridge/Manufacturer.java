package patterns.bridge;

public abstract class Manufacturer {
    Vehicle vehicle;

    public Manufacturer(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void createVehicle();
}
