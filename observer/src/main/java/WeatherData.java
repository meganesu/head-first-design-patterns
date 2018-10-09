import java.util.ArrayList;

public class WeatherData implements Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observers;

    WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }
}
