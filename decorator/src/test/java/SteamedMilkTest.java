import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SteamedMilkTest {
    @Test
    public void shouldAddCorrectCostToBeverage() {
        Beverage coffee = mock(HouseBlend.class);
        when(coffee.cost()).thenReturn(0.89);
        coffee = new SteamedMilk(coffee);

        assertEquals(0.89 + 0.10, coffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        Beverage coffee = mock(DarkRoast.class);
        when(coffee.getDescription()).thenReturn("Dark roast");
        coffee = new SteamedMilk(coffee);

        assertEquals("Dark roast, steamed milk", coffee.getDescription());
    }
}
