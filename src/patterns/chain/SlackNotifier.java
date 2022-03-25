package patterns.chain;

public class SlackNotifier extends Notifier{

    public SlackNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Send a message to Slack: " + message);
    }
}
