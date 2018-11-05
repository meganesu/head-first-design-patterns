import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PizzaStoreTest {
    PizzaStore pizzaStore;
    SimplePizzaFactory pizzaFactory;

    @Before
    public void setUp() {
        pizzaFactory = mock(SimplePizzaFactory.class);
        pizzaStore = new PizzaStore(pizzaFactory);
    }

    @Test
    public void shouldReturnCheesePizza() {
        when(pizzaFactory.createPizza(anyString())).thenReturn(new CheesePizza());

        Pizza pizza = pizzaStore.orderPizza("cheese");

        assertThat(pizza, instanceOf(CheesePizza.class));
        verify(pizzaFactory).createPizza("cheese");
    }

    @Test
    public void shouldReturnPepperoniPizza() {
        when(pizzaFactory.createPizza(anyString())).thenReturn(new PepperoniPizza());

        Pizza pizza = pizzaStore.orderPizza("pepperoni");

        assertThat(pizza, instanceOf(PepperoniPizza.class));
        verify(pizzaFactory).createPizza("pepperoni");
    }

    @Test
    public void shouldReturnVeggiePizza() {
        when(pizzaFactory.createPizza(anyString())).thenReturn(new VeggiePizza());

        Pizza pizza = pizzaStore.orderPizza("veggie");

        assertThat(pizza, instanceOf(VeggiePizza.class));
        verify(pizzaFactory).createPizza("veggie");
    }

    @Test
    public void shouldReturnSeafoodPizza() {
        when(pizzaFactory.createPizza(anyString())).thenReturn(new SeafoodPizza());

        Pizza pizza = pizzaStore.orderPizza("seafood");

        assertThat(pizza, instanceOf(SeafoodPizza.class));
        verify(pizzaFactory).createPizza("seafood");
    }
}
