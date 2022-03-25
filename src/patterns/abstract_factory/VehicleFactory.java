package patterns.abstract_factory;

interface VehicleFactory {

    Vehicle create();

    static VehicleFactory create(VehicleType type) {
        return switch (type) {
            case CAR -> {
                yield new CarFactory();
            }
            case MOTORBIKE -> {
                yield new MotorbikeFactory();
            }
            default -> throw new IllegalArgumentException();
        };
    }
}
