import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnifeTest {
    @Test
    public void shouldPrintKnifeMessage() {
        Knife knife = new Knife();
        assertEquals("Stab with knife", knife.useWeapon());
    }
}
