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
        assertThat(pizza, instanceOf(ChicagoCheesePizza.class));
    }

    @Test
    public void shouldReturnChicagoPepperoniPizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        assertThat(pizza, instanceOf(ChicagoPepperoniPizza.class));
    }

    @Test
    public void shouldReturnChicagoVeggiePizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("veggie");
        assertThat(pizza, instanceOf(ChicagoVeggiePizza.class));
    }

    @Test
    public void shouldReturnChicagoSeafoodPizzaWhenChicagoPizzaFactory() {
        Pizza pizza = pizzaStore.orderPizza("seafood");
        assertThat(pizza, instanceOf(ChicagoClamPizza.class));
    }
}
