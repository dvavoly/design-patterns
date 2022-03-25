package patterns.factory_method;

public class CabinetMakerFactory implements WoodWorkerFactory{
    @Override
    public WoodWorker createWoodWorker() {
        return new CabinetMaker();
    }
}
