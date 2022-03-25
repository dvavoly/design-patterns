package patterns.builder;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse() {

        builder.buildHouse();
        builder.setName();
        builder.buildWindows();
        builder.buildDoors();
        builder.buildRooms();
        builder.hasSwimPool();
        builder.hasGarden();

        return builder.getHouse();
    }
}
