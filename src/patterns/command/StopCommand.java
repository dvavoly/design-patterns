package patterns.command;

public class StopCommand implements Command{

    private Car car;

    public StopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }
}
