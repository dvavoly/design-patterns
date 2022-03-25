package patterns.strategy;

public class Cloudy implements Weather{
    @Override
    public void change() {
        System.out.println("Mostly cloudy skies early, then partly cloudy after midnight.");
    }
}
