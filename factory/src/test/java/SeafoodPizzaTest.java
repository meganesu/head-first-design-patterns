import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SeafoodPizzaTest {
    PizzaIngredientFactory ingredientFactory;

    @Test
    public void shouldReturnPizzaWithNYIngredientsWhenNYPizzaIngredientFactory() {
        ArrayList<Class> expectedToppings = new ArrayList<>();
        expectedToppings.add(ReggianoCheese.class);
        expectedToppings.add(FreshClams.class);

        ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new SeafoodPizza(ingredientFactory);

        assertThat(pizza.dough, instanceOf(ThinCrustDough.class));
        assertThat(pizza.sauce, instanceOf(MarinaraSauce.class));
        for (Topping topping : pizza.toppings) {
            assertTrue(expectedToppings.contains(topping.getClass()));
        }
    }

    @Test
    public void shouldReturnPizzaWithChicagoIngredientsWhenChicagoPizzaIngredientFactory() {
        ArrayList<Class> expectedToppings = new ArrayList<>();
        expectedToppings.add(MozzarellaCheese.class);
        expectedToppings.add(FrozenClams.class);

        ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = new SeafoodPizza(ingredientFactory);

        assertThat(pizza.dough, instanceOf(ThickCrustDough.class));
        assertThat(pizza.sauce, instanceOf(PlumTomatoSauce.class));
        for (Topping topping : pizza.toppings) {
            assertTrue(expectedToppings.contains(topping.getClass()));
        }
    }
}
