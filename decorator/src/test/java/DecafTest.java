import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecafTest {
    @Test
    public void shouldReturnCorrectPrice() {
        Decaf coffee = new Decaf();
        assertEquals(1.05, coffee.cost(), 0.00001);
    }

    @Test
    public void shouldReturnCorrectDescription() {
        Decaf coffee = new Decaf();
        assertEquals("Decaf", coffee.getDescription());
    }
}
