package patterns.builder;

public class SmallHouse extends HouseBuilder{
    @Override
    void setName() {
        house.setName("Small private house");
    }

    @Override
    void buildWindows() {
        house.setWindows(5);
    }

    @Override
    void buildDoors() {
        house.setDoors(3);
    }

    @Override
    void buildRooms() {
        house.setRooms(3);
    }

    @Override
    void hasSwimPool() {
        house.setHasSwimPool(false);
    }

    @Override
    void hasGarden() {
        house.setHasGarden(true);
    }
}
