package patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer("Lenovo", "Intel Core i3", "8GB", "256GB");

        System.out.println(pc);

        ComputerFactory factory = new ComputerFactory(pc);

        Computer pcClone = factory.cloneComputer();

        System.out.println();
        System.out.println(pcClone);
    }
}
