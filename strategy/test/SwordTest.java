import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    @Test
    public void shouldPrintSwordMessage() {
       Sword sword = new Sword();
       String message = sword.useWeapon();
       assertEquals("Swing sword", message);
    }
}
