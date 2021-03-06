import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseBlendTest {
    @Test
    public void shouldReturnCorrectPrice() {
        HouseBlend coffee = new HouseBlend();
        assertEquals(0.89, coffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        HouseBlend coffee = new HouseBlend();
        assertEquals("House blend", coffee.getDescription());
    }

    @Test
    public void shouldUpdateSize() {
        HouseBlend coffee = new HouseBlend();
        coffee.setSize(HouseBlend.Size.VENTI);
        assertEquals(HouseBlend.Size.VENTI, coffee.getSize());
    }
}
