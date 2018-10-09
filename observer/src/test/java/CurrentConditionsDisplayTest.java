import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CurrentConditionsDisplayTest {
    @Test
    public void shouldDisplayCurrentWeatherConditions() {
        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        currentConditionsDisplay.update(75.2f, 40f, 20.3f);

        String contentToPrint = "Current temperature: 75˚F. Current humidity: 40.0%.";
        verify(printStream).println(contentToPrint);

        currentConditionsDisplay.update(88.13f, 12f, 14.0f);

        contentToPrint = "Current temperature: 88˚F. Current humidity: 12.0%.";
        verify(printStream).println(contentToPrint);
    }
}
