package patterns.command;

public class Driver {

    private final Command startEngine;
    private final Command drive;
    private final Command slowDown;
    private final Command stop;

    public Driver(Command startEngine, Command drive, Command slowDown, Command stop) {
        this.startEngine = startEngine;
        this.drive = drive;
        this.slowDown = slowDown;
        this.stop = stop;
    }

    public void startEngine() {
        startEngine.execute();
    }

    public void drive() {
        drive.execute();
    }

    public void slowDown() {
        slowDown.execute();
    }

    public void stop() {
        stop.execute();
    }
}
