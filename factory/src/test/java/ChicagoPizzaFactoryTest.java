import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ChicagoPizzaFactoryTest {
    ChicagoPizzaFactory pizzaFactory;

    @Before
    public void setUp() {
        pizzaFactory = new ChicagoPizzaFactory();
    }

    @Test
    public void shouldReturnNYCheesePizza() {
        Pizza pizza = pizzaFactory.createPizza("cheese");
        assertThat(pizza, instanceOf(ChicagoCheesePizza.class));
    }

    @Test
    public void shouldReturnNYPepperoniPizza() {
        Pizza pizza = pizzaFactory.createPizza("pepperoni");
        assertThat(pizza, instanceOf(ChicagoPepperoniPizza.class));
    }

    @Test
    public void shouldReturnNYVeggiePizza() {
        Pizza pizza = pizzaFactory.createPizza("veggie");
        assertThat(pizza, instanceOf(ChicagoVeggiePizza.class));
    }

    @Test
    public void shouldReturnNYSeafoodPizza() {
        Pizza pizza = pizzaFactory.createPizza("seafood");
        assertThat(pizza, instanceOf(ChicagoClamPizza.class));
    }
}
