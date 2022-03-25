package patterns.strategy;

public class Showers implements Weather{

    @Override
    public void change() {
        System.out.println("Mostly cloudy in the evening then periods of showers after midnight. Low 4C. Winds W at 10 to 15 km/h. Chance of rain 30%.");
    }
}
