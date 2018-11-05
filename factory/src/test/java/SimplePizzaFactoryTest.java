import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class SimplePizzaFactoryTest {
    SimplePizzaFactory pizzaFactory;

    @Before
    public void setUp() {
        pizzaFactory = new SimplePizzaFactory();
    }

    @Test
    public void shouldReturnCheesePizza() {
        Pizza pizza = pizzaFactory.createPizza("cheese");
        assertThat(pizza, instanceOf(CheesePizza.class));
    }

    @Test
    public void shouldReturnPepperoniPizza() {
        Pizza pizza = pizzaFactory.createPizza("pepperoni");
        assertThat(pizza, instanceOf(PepperoniPizza.class));
    }

    @Test
    public void shouldReturnVeggiePizza() {
        Pizza pizza = pizzaFactory.createPizza("veggie");
        assertThat(pizza, instanceOf(VeggiePizza.class));
    }

    @Test
    public void shouldReturnSeafoodPizza() {
        Pizza pizza = pizzaFactory.createPizza("seafood");
        assertThat(pizza, instanceOf(SeafoodPizza.class));
    }
}
