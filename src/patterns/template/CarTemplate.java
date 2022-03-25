package patterns.template;

public abstract class CarTemplate {
    public void carParts() {
        System.out.println("Car body.");
        addEngine();
        System.out.println("Car wheels.");
    }

    public abstract void addEngine();
}
