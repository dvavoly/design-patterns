package patterns.abstract_factory;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}
