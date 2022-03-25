package patterns.strategy;

public class Thunderstorm implements Weather{
    @Override
    public void change() {
        System.out.println("Heavy rain, strong winds, thunderstorms!!!");
    }
}
