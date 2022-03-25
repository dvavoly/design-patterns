package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgencySite implements Observed{
    List<String> news = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addNews(String news) {
        this.news.add(news);
        notifyObserved();
    }

    public void removeNews(String news) {
        this.news.remove(news);
        notifyObserved();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserved(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserved() {
        subscribers.forEach(observer -> observer.handleEvent(this.news));
    }
}
