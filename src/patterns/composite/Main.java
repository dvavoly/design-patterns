package patterns.composite;

public class Main {
    public static void main(String[] args) {

        Picture picture = new Picture();

        Graphic firstDot = new Dot();
        Graphic secondDot = new Dot();
        Graphic circle = new Circle();

        picture.addGraphic(firstDot);
        picture.addGraphic(secondDot);
        picture.addGraphic(circle);

        picture.drawPicture();
    }
}
