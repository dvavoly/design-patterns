package patterns.template;

public class ElectricCar extends CarTemplate{
    @Override
    public void addEngine() {
        System.out.println("Electric car engine");
    }
}
