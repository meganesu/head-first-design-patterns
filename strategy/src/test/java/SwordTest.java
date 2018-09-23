import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SwordTest {
    @Test
    public void shouldPrintSwordMessage() {
        WeaponBehavior sword = new Sword();

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        sword.useWeapon();

        verify(printStream).println("Swing sword");
    }
}
