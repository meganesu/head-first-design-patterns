public class CurrentConditionsDisplay implements Display {
    private float temperature;
    private float humidity;

    public void display() {
        String contentToPrint = String.format("Current temperature: %.0f˚F. Current humidity: %.1f%%.", temperature, humidity);
        System.out.println(contentToPrint);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
