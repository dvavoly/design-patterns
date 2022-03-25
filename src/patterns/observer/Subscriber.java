package patterns.observer;

import java.util.List;

public record Subscriber(String name) implements Observer {

    @Override
    public void handleEvent(List<String> news) {
        System.out.println("Dear "+ name + " News are coming: ");
        news.forEach(System.out::println);
    }
}
