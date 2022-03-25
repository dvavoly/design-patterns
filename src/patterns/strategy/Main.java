package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth();

        earth.setWeather(new Cloudy());
        earth.changeWeather();

        earth.setWeather(new Showers());
        earth.changeWeather();

        earth.setWeather(new Sunny());
        earth.changeWeather();

        earth.setWeather(new Thunderstorm());
        earth.changeWeather();

        earth.setWeather(new Sunny());
        earth.changeWeather();

    }
}
