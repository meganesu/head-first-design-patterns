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
        assertThat(pizza, instanceOf(CheesePizza.class));
    }

    @Test
    public void shouldReturnNYPepperoniPizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertThat(pizza, instanceOf(PepperoniPizza.class));
    }

    @Test
    public void shouldReturnNYVeggiePizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("veggie");
        assertThat(pizza, instanceOf(VeggiePizza.class));
    }

    @Test
    public void shouldReturnNYSeafoodPizzaWhenNYPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("seafood");
        assertThat(pizza, instanceOf(SeafoodPizza.class));
    }

}
