import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkRoastTest {
    @Test
    public void shouldReturnCorrectPrice() {
        DarkRoast coffee = new DarkRoast();
        assertEquals(0.99, coffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        DarkRoast coffee = new DarkRoast();
        assertEquals("Dark roast", coffee.getDescription());
    }
}
