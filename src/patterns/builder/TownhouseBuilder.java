package patterns.builder;

public class TownhouseBuilder extends HouseBuilder {
    @Override
    void setName() {
        house.setName("The house of my dream.");
    }

    @Override
    void buildWindows() {
        house.setWindows(10);
    }

    @Override
    void buildDoors() {
        house.setDoors(4);
    }

    @Override
    void buildRooms() {
        house.setRooms(6);
    }

    @Override
    void hasSwimPool() {
        house.setHasSwimPool(true);
    }

    @Override
    void hasGarden() {
        house.setHasGarden(false);
    }
}
