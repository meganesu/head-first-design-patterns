import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WhippedCreamTest {
    @Test
    public void shouldAddCorrectCostToBeverage() {
        Beverage coffee = mock(Decaf.class);
        when(coffee.cost()).thenReturn(1.05);
        coffee = new WhippedCream(coffee);

        assertEquals(1.05 + 0.10, coffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        Beverage coffee = mock(Espresso.class);
        when(coffee.getDescription()).thenReturn("Espresso");
        coffee = new WhippedCream(coffee);

        assertEquals("Espresso, whipped cream", coffee.getDescription());
    }
}
