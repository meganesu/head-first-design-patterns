import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AxeBehaviorTest {
    @Test
    public void shouldPrintAxeMessage() {
        WeaponBehavior axe = new AxeBehavior();

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        axe.useWeapon();

        verify(printStream).println("Swing axe");
    }
}
