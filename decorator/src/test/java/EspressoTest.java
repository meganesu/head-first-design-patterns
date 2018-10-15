import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspressoTest {
    @Test
    public void shouldReturnCorrectPrice() {
        Espresso coffee = new Espresso();
        assertEquals(1.99, coffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        Espresso coffee = new Espresso();
        assertEquals("Espresso", coffee.getDescription());
    }
}
