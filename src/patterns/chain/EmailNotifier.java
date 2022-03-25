package patterns.chain;

public class EmailNotifier extends Notifier{

    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send an email: " + message);
    }
}
