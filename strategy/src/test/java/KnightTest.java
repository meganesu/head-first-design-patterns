import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class KnightTest {
    @Test
    public void shouldPrintFightMessage() {
        WeaponBehavior weapon = mock(AxeBehavior.class);
        Character knight = new Knight(weapon);

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        knight.fight();

        verify(printStream).println("Knight attacks!");
        verify(weapon).useWeapon();
    }
}
