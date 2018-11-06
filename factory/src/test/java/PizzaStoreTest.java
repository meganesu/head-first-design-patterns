import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PizzaStoreTest {
    PizzaStore pizzaStore;
    PizzaFactory pizzaFactory;

    public void setUpNYPizzaStore() {
        pizzaFactory = mock(NYPizzaFactory.class);
        pizzaStore = new PizzaStore(pizzaFactory);
    }

    public void setUpChicagoPizzaStore() {
        pizzaFactory = mock(ChicagoPizzaFactory.class);
        pizzaStore = new PizzaStore(pizzaFactory);
    }

    @Test
    public void shouldReturnNYCheesePizzaWhenNYPizzaFactory() {
        setUpNYPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new NYCheesePizza());

        Pizza pizza = pizzaStore.orderPizza("cheese");

        assertThat(pizza, instanceOf(NYCheesePizza.class));
        verify(pizzaFactory).createPizza("cheese");
    }

    @Test
    public void shouldReturnNYPepperoniPizzaWhenNYPizzaFactory() {
        setUpNYPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new NYPepperoniPizza());

        Pizza pizza = pizzaStore.orderPizza("pepperoni");

        assertThat(pizza, instanceOf(NYPepperoniPizza.class));
        verify(pizzaFactory).createPizza("pepperoni");
    }

    @Test
    public void shouldReturnNYVeggiePizzaWhenNYPizzaFactory() {
        setUpNYPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new NYVeggiePizza());

        Pizza pizza = pizzaStore.orderPizza("veggie");

        assertThat(pizza, instanceOf(NYVeggiePizza.class));
        verify(pizzaFactory).createPizza("veggie");
    }

    @Test
    public void shouldReturnNYSeafoodPizzaWhenNYPizzaFactory() {
        setUpNYPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new NYClamPizza());

        Pizza pizza = pizzaStore.orderPizza("seafood");

        assertThat(pizza, instanceOf(NYClamPizza.class));
        verify(pizzaFactory).createPizza("seafood");
    }

    @Test
    public void shouldReturnChicagoCheesePizzaWhenChicagoPizzaFactory() {
        setUpChicagoPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new ChicagoCheesePizza());

        Pizza pizza = pizzaStore.orderPizza("cheese");

        assertThat(pizza, instanceOf(ChicagoCheesePizza.class));
        verify(pizzaFactory).createPizza("cheese");
    }

    @Test
    public void shouldReturnChicagoPepperoniPizzaWhenChicagoPizzaFactory() {
        setUpChicagoPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new ChicagoPepperoniPizza());

        Pizza pizza = pizzaStore.orderPizza("pepperoni");

        assertThat(pizza, instanceOf(ChicagoPepperoniPizza.class));
        verify(pizzaFactory).createPizza("pepperoni");
    }

    @Test
    public void shouldReturnChicagoVeggiePizzaWhenChicagoPizzaFactory() {
        setUpChicagoPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new ChicagoVeggiePizza());

        Pizza pizza = pizzaStore.orderPizza("veggie");

        assertThat(pizza, instanceOf(ChicagoVeggiePizza.class));
        verify(pizzaFactory).createPizza("veggie");
    }

    @Test
    public void shouldReturnChicagoSeafoodPizzaWhenChicagoPizzaFactory() {
        setUpChicagoPizzaStore();
        when(pizzaFactory.createPizza(anyString())).thenReturn(new ChicagoClamPizza());

        Pizza pizza = pizzaStore.orderPizza("seafood");

        assertThat(pizza, instanceOf(ChicagoClamPizza.class));
        verify(pizzaFactory).createPizza("seafood");
    }
}
