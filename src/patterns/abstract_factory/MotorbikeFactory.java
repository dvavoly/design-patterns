package patterns.abstract_factory;

public class MotorbikeFactory implements VehicleFactory{
    @Override
    public Vehicle create() {
        return new Motorbike();
    }
}
