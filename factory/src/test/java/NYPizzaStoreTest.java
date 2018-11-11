import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class NYPizzaStoreTest {
    PizzaStore pizzaStore;

    @Before
    public void setUp() {
        pizzaStore = new NYPizzaStore();
    }

    @Test
    public void shouldReturnNYCheesePizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertThat(pizza, instanceOf(NYCheesePizza.class));
    }

    @Test
    public void shouldReturnNYPepperoniPizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertThat(pizza, instanceOf(NYPepperoniPizza.class));
    }

    @Test
    public void shouldReturnNYVeggiePizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("veggie");
        assertThat(pizza, instanceOf(NYVeggiePizza.class));
    }

    @Test
    public void shouldReturnNYSeafoodPizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("seafood");
        assertThat(pizza, instanceOf(NYClamPizza.class));
    }

}
