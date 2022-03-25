package patterns.factory_method;

public class Main {
    public static void main(String[] args) {

        WoodWorkerFactory workerFactory = createWoodWorkerByTypeOfFurniture(Furniture.BAD);
        WoodWorker worker = workerFactory.createWoodWorker();

        worker.make();
    }

    enum Furniture {
        BAD, CHAIR, DESK
    }

    private static WoodWorkerFactory createWoodWorkerByTypeOfFurniture(Furniture furniture) {
        return switch (furniture) {
            case BAD -> {
                yield new FurnitureMakerFactory();
            }
            case DESK, CHAIR -> {
                yield new CabinetMakerFactory();
            }
        };
    }
}
