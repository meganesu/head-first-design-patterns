import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ChicagoPizzaStoreTest {
    PizzaStore pizzaStore;

    @Before
    public void setUp() {
        pizzaStore = new ChicagoPizzaStore();
    }

    @Test
    public void shouldReturnChicagoCheesePizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertThat(pizza, instanceOf(CheesePizza.class));
    }

    @Test
    public void shouldReturnChicagoPepperoniPizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertThat(pizza, instanceOf(PepperoniPizza.class));
    }

    @Test
    public void shouldReturnChicagoVeggiePizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("veggie");
        assertThat(pizza, instanceOf(VeggiePizza.class));
    }

    @Test
    public void shouldReturnChicagoSeafoodPizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("seafood");
        assertThat(pizza, instanceOf(SeafoodPizza.class));
    }
}
