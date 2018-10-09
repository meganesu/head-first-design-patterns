import java.util.ArrayList;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<CurrentConditionsDisplay> displays;

    WeatherData() {
        this.displays = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    private void notifyObserver() {
        for (CurrentConditionsDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void registerObserver(CurrentConditionsDisplay currentConditionsDisplay) {
        this.displays.add(currentConditionsDisplay);
    }
}
