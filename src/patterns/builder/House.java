package patterns.builder;

public class House {
    private String name;
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasSwimPool;
    private boolean hasGarden;

    public void setName(String name) {
        this.name = name;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasSwimPool=" + hasSwimPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
