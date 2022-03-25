package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture {
    private List<Graphic> graphics = new ArrayList<>();

    public void addGraphic(Graphic graphic) {
        graphics.add(graphic);
    }

    public void removeGraphic(Graphic graphic) {
        graphics.remove(graphic);
    }

    public void drawPicture() {
        System.out.println("Painter creates picture.");
        graphics.forEach(Graphic::draw);
    }
}
