package patterns.decorator;

public class EmailSender implements NotificationSender {

    private final NotificationSender sender;

    public EmailSender(NotificationSender sender) {
        this.sender = sender;
    }

    public EmailSender() {
        sender = () -> System.out.println("Alarm!");
    }

    @Override
    public void send() {
        sender.send();
        System.out.println("Sending email notification.");
    }
}
