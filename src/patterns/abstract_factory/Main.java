package patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory1 = VehicleFactory.create(VehicleType.CAR);
        Vehicle v1 = factory1.create();
        v1.drive();

        VehicleFactory factory2 = VehicleFactory.create(VehicleType.MOTORBIKE);
        Vehicle v2 = factory2.create();
        v2.drive();
    }
}
