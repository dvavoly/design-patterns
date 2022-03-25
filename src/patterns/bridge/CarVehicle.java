package patterns.bridge;

class CarVehicle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car drives on a road...");
    }
}
