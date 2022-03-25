package patterns.strategy;

public class Earth {
    Weather weather;

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void changeWeather() {
        weather.change();
    }
}
