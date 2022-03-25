package patterns.decorator;

public class SMSSender implements NotificationSender{

    private final NotificationSender sender;

    public SMSSender(NotificationSender sender) {
        this.sender = sender;
    }

    public SMSSender() {
        sender = () -> System.out.println("Alarm!");
    }

    @Override
    public void send() {
        sender.send();
        System.out.println("Sending SMS notification.");
    }
}
