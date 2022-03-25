package patterns.factory_method;

public class FurnitureMaker implements WoodWorker{
    @Override
    public void make() {
        System.out.println("Woodworker make furniture.");
    }
}
