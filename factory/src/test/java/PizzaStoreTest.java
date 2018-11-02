import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class PizzaStoreTest {
    PizzaStore pizzaStore;

    @Before
    public void setUp() {
        pizzaStore = new PizzaStore();
    }

    @Test
    public void shouldReturnCheesePizza() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertThat(pizza, instanceOf(CheesePizza.class));
    }

    @Test
    public void shouldReturnPepperoniPizza() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertThat(pizza, instanceOf(PepperoniPizza.class));
    }

    @Test
    public void shouldReturnVeggiePizza() {
        Pizza pizza = pizzaStore.orderPizza("veggie");
        assertThat(pizza, instanceOf(VeggiePizza.class));
    }

    @Test
    public void shouldReturnSeafoodPizza() {
        Pizza pizza = pizzaStore.orderPizza("seafood");
        assertThat(pizza, instanceOf(SeafoodPizza.class));
    }
}
