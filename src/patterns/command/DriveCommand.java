package patterns.command;

public class DriveCommand implements Command{

    private Car car;

    public DriveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.drive();
    }
}
