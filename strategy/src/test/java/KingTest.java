import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class KingTest {
    @Test
    public void shouldPrintFightMessage() {
        WeaponBehavior weapon = mock(BowAndArrowBehavior.class);
        Character king = new King(weapon);

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        king.fight();

        verify(printStream).println("King attacks!");
        verify(weapon).useWeapon();
    }
}
