import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BowAndArrowTest {
    @Test
    public void shouldPrintBowAndArrowMessage() {
        WeaponBehavior bowAndArrow = new BowAndArrow();

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        bowAndArrow.useWeapon();

        verify(printStream).println("Shoot arrow");
    }
}
