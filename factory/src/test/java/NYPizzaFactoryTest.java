import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class NYPizzaFactoryTest {
    NYPizzaFactory pizzaFactory;

    @Before
    public void setUp() {
        pizzaFactory = new NYPizzaFactory();
    }

    @Test
    public void shouldReturnNYCheesePizza() {
        Pizza pizza = pizzaFactory.createPizza("cheese");
        assertThat(pizza, instanceOf(NYCheesePizza.class));
    }

    @Test
    public void shouldReturnNYPepperoniPizza() {
        Pizza pizza = pizzaFactory.createPizza("pepperoni");
        assertThat(pizza, instanceOf(NYPepperoniPizza.class));
    }

    @Test
    public void shouldReturnNYVeggiePizza() {
        Pizza pizza = pizzaFactory.createPizza("veggie");
        assertThat(pizza, instanceOf(NYVeggiePizza.class));
    }

    @Test
    public void shouldReturnNYSeafoodPizza() {
        Pizza pizza = pizzaFactory.createPizza("seafood");
        assertThat(pizza, instanceOf(NYClamPizza.class));
    }
}
