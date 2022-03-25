package patterns.command;

public class StartEngineCommand implements Command{

    private Car car;

    public StartEngineCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
