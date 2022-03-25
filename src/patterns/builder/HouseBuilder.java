package patterns.builder;

public abstract class HouseBuilder {
    House house;

    void buildHouse() {
        house = new House();
    }

    abstract void setName();

    abstract void buildWindows();

    abstract void buildDoors();

    abstract void buildRooms();

    abstract void hasSwimPool();

    abstract void hasGarden();

    House getHouse() {
        return house;
    }
}
