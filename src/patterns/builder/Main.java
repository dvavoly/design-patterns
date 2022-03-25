package patterns.builder;

public class Main {
    public static void main(String[] args) {

    Director director = new Director();

    director.setBuilder(new TownhouseBuilder());
    House house = director.buildHouse();

    System.out.println(house);

    }
}
