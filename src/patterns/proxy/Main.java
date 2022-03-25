package patterns.proxy;

public class Main {

    public static void main(String[] args) {
        db productionDB = new ProxyDB();

        for (int i = 0; i < 5; i++) {
            productionDB.create("Test");
            productionDB.read("Test");
        }
    }
}
