package patterns.strategy;

public class Sunny implements Weather{
    @Override
    public void change() {
        System.out.println("Sunny. Clear skies. Low around 10C. Winds NNE at 15 to 25 km/h.");
    }
}
