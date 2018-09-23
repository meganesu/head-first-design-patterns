import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class KnifeTest {
    @Test
    public void shouldPrintKnifeMessage() {
        WeaponBehavior knife = new Knife();

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        knife.useWeapon();

        verify(printStream).println("Stab with knife");
    }
}
