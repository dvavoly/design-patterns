package patterns.chain;

public class Main {
    public static void main(String[] args) {

        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier slackNotifier = new SlackNotifier(Priority.EMERGENCY);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(slackNotifier);

        reportNotifier.notifyManager("Everything is Okay.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston, we have a problem!!!", Priority.EMERGENCY);

    }
}
