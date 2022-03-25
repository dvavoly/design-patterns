package patterns.template;

public class MuscleCar extends CarTemplate{
    @Override
    public void addEngine() {
        System.out.println("Muscle car engine");
    }
}
