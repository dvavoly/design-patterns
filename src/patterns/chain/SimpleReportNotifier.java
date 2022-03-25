package patterns.chain;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notify using a simple report: " + message);
    }
}
