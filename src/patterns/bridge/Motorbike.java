package patterns.bridge;

public class Motorbike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Motorbike drives on a road...");
    }
}
