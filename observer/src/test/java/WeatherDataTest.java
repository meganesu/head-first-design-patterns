import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyFloat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class WeatherDataTest {
    @Test
    public void shouldNotifyObserversWhenMeasurementsChanged() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = mock(CurrentConditionsDisplay.class);
        CurrentConditionsDisplay anotherCurrentConditionsDisplay = mock(CurrentConditionsDisplay.class);
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(anotherCurrentConditionsDisplay);

        weatherData.setMeasurements(92.0f, 40f, 30.2f);

        verify(currentConditionsDisplay).update(92.0f, 40f, 30.2f);
        verify(anotherCurrentConditionsDisplay).update(92.0f, 40f, 30.2f);
    }

    @Test
    public void shouldNotNotifyNonObserversWhenMeasurementsChanged() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay removedObserver = mock(CurrentConditionsDisplay.class);
        CurrentConditionsDisplay neverAnObserver = mock(CurrentConditionsDisplay.class);
        weatherData.registerObserver(removedObserver);
        weatherData.removeObserver(removedObserver);

        weatherData.setMeasurements(92.0f, 40f, 30.2f);

        verify(removedObserver, never()).update(anyFloat(), anyFloat(), anyFloat());
        verify(neverAnObserver, never()).update(anyFloat(), anyFloat(), anyFloat());
    }
}
