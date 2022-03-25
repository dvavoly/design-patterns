package patterns.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgencySite newsAgency = new NewsAgencySite();
        Observer firstSubscriber = new Subscriber("Bob");
        Observer secondSubscriber = new Subscriber("Smith");

        newsAgency.addNews("First news");
        newsAgency.addNews("Second news");

        newsAgency.addObserver(firstSubscriber);
        newsAgency.addObserver(secondSubscriber);

        newsAgency.addNews("Third news");
        newsAgency.removeNews("First news");
    }
}
