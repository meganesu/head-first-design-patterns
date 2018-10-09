import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WeatherDataTest {
    @Test
    public void shouldNotifyObserverWhenMeasurementsChanged() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = mock(CurrentConditionsDisplay.class);
        CurrentConditionsDisplay anotherCurrentConditionsDisplay = mock(CurrentConditionsDisplay.class);
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(anotherCurrentConditionsDisplay);

        weatherData.setMeasurements(92.0f, 40f, 30.2f);

        verify(currentConditionsDisplay).update(92.0f, 40f, 30.2f);
        verify(anotherCurrentConditionsDisplay).update(92.0f, 40f, 30.2f);
    }
}
