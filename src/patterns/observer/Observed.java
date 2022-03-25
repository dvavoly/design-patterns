package patterns.observer;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserved(Observer observer);

    void notifyObserved();
}
