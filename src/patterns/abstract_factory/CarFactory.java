package patterns.abstract_factory;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle create() {
        return new Car();
    }
}
