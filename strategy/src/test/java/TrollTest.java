import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TrollTest {
    @Test
    public void shouldPrintFightMessage() {
        WeaponBehavior weapon = mock(KnifeBehavior.class);
        Character troll = new Troll(weapon);

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        troll.fight();

        verify(printStream).println("Troll attacks!");
        verify(weapon).useWeapon();
    }
}
