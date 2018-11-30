import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ChocolateBoilerTest {
    @Test
    public void shouldReturnAChocolateBoilerWhenGetInstanceIsCalled() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        assertThat(boiler, instanceOf(ChocolateBoiler.class));
    }

    @Test
    public void shouldReturnSameInstanceWhenGetInstanceIsCalledMultipleTimes() {
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        assertEquals(boiler1, boiler2);
    }
}
