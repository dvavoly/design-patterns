package patterns.mediator;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        this.mediator.start();
    }

    public void turnOff() {
        isOn = false;
        this.mediator.stop();
    }
}
