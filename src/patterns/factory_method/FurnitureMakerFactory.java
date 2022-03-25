package patterns.factory_method;

public class FurnitureMakerFactory implements WoodWorkerFactory{
    @Override
    public WoodWorker createWoodWorker() {
        return new FurnitureMaker();
    }
}
