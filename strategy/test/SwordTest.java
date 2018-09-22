import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    @Test
    public void shouldPrintSwordMessage() {
       Sword sword = new Sword();
       assertEquals("Swing sword", sword.useWeapon());
    }
}
