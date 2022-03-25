package patterns.factory_method;

public class CabinetMaker implements WoodWorker{
    @Override
    public void make() {
        System.out.println("Woodworker makes article wooden furniture");
    }
}
