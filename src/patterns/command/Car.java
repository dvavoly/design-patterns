package patterns.command;

public class Car {

    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }

    public void drive() {
        System.out.println("The car starts driving.");
    }

    public void slowDown() {
        System.out.println("The car is slowing down.");
    }

    public void stop() {
        System.out.println("The car stopped.");
    }
}
