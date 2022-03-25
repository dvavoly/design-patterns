package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        NotificationSender s1 = new EmailSender(new SMSSender());
        NotificationSender s2 = new SMSSender(new EmailSender());

        s1.send();
        System.out.println();
        s2.send();
    }
}
