import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SoyMilkTest {
    @Test
    public void shouldAddCorrectCostToBeverage() {
        Beverage smallCoffee = mock(HouseBlend.class);
        Beverage mediumCoffee = mock(HouseBlend.class);
        Beverage largeCoffee = mock(HouseBlend.class);
        when(smallCoffee.cost()).thenReturn(0.89);
        when(smallCoffee.getSize()).thenReturn(Beverage.Size.TALL);
        when(mediumCoffee.cost()).thenReturn(0.89);
        when(mediumCoffee.getSize()).thenReturn(Beverage.Size.GRANDE);
        when(largeCoffee.cost()).thenReturn(0.89);
        when(largeCoffee.getSize()).thenReturn(Beverage.Size.VENTI);

        smallCoffee = new SoyMilk(smallCoffee);
        mediumCoffee = new SoyMilk(mediumCoffee);
        largeCoffee = new SoyMilk(largeCoffee);

        assertEquals(0.89 + 0.10, smallCoffee.cost(), 0.00001);
        assertEquals(0.89 + 0.15, mediumCoffee.cost(), 0.00001);
        assertEquals(0.89 + 0.20, largeCoffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        Beverage coffee = mock(DarkRoast.class);
        when(coffee.getDescription()).thenReturn("Dark roast");
        coffee = new SoyMilk(coffee);

        assertEquals("Dark roast, soy milk", coffee.getDescription());
    }
}
