import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CurrentConditionsDisplayTest {
    @Test
    public void shouldDisplayCurrentWeatherConditions() {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        currentConditionsDisplay.update(75.2f, 40f, 20.3f);

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        currentConditionsDisplay.display();
        String contentToPrint = "Current temperature: 75˚F. Current humidity: 40.0%.";
        verify(printStream).println(contentToPrint);

        currentConditionsDisplay.update(88.13f, 12f, 14.0f);

        currentConditionsDisplay.display();
        contentToPrint = "Current temperature: 88˚F. Current humidity: 12.0%.";
        verify(printStream).println(contentToPrint);
    }
}
