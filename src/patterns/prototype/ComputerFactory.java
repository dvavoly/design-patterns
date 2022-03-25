package patterns.prototype;

public class ComputerFactory {
    Computer computer;

    public ComputerFactory(Computer computer) {
        this.computer = computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    Computer cloneComputer() {
        return (Computer) computer.copy();
    }
}
