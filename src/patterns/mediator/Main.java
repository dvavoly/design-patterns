package patterns.mediator;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        Button button = new Button();
        Fan fan = new Fan();
        PowerSupplier power = new PowerSupplier();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(power);

        System.out.println(fan.isOn());
        button.press();
        System.out.println(fan.isOn());
        button.press();
        System.out.println(fan.isOn());
    }
}
