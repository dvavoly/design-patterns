package patterns.command;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Driver driver = new Driver(
                new StartEngineCommand(car),
                new DriveCommand(car),
                new SlowDownCommand(car),
                new StopCommand(car)
        );

        driver.startEngine();
        driver.drive();
        driver.slowDown();
        driver.stop();
    }
}
