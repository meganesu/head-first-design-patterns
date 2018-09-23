import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class KnifeBehaviorTest {
    @Test
    public void shouldPrintKnifeMessage() {
        WeaponBehavior knife = new KnifeBehavior();

        PrintStream printStream = mock(PrintStream.class);
        System.setOut(printStream);

        knife.useWeapon();

        verify(printStream).println("Stab with knife");
    }
}
