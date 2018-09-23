import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class QueenTest {
    @Test
    public void shouldPrintFightMessage() {
        WeaponBehavior weapon = mock(SwordBehavior.class);
        Character queen = new Queen(weapon);

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        queen.fight();

        verify(printStream).println("Queen attacks!");
        verify(weapon).useWeapon();
    }
}
