package patterns.chain;

import java.util.Objects;

public abstract class Notifier {

    private Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, Priority level) {

        if (level.getValue() >= priority.getValue()) {
            write(message);
        }

        if (Objects.nonNull(nextNotifier)) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
