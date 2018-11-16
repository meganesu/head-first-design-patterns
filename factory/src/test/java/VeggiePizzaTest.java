import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class VeggiePizzaTest {
    PizzaIngredientFactory ingredientFactory;

    @Test
    public void shouldReturnPizzaWithNYIngredientsWhenNYIngredientFactory() {
        ArrayList<Class> expectedToppings = new ArrayList<>();
        expectedToppings.add(ReggianoCheese.class);
        expectedToppings.add(BellPeppers.class);
        ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new VeggiePizza(ingredientFactory);

        assertThat(pizza.dough, instanceOf(ThinCrustDough.class));
        assertThat(pizza.sauce, instanceOf(MarinaraSauce.class));
        for (Topping topping : pizza.toppings) {
            assertTrue(expectedToppings.contains(topping.getClass()));
        }
    }

    @Test
    public void shouldReturnPizzaWithChicagoIngredientsWhenChicagoIngredientFactory() {
        ArrayList<Class> expectedToppings = new ArrayList<>();
        expectedToppings.add(MozzarellaCheese.class);
        expectedToppings.add(Mushrooms.class);
        ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = new VeggiePizza(ingredientFactory);

        assertThat(pizza.dough, instanceOf(ThickCrustDough.class));
        assertThat(pizza.sauce, instanceOf(PlumTomatoSauce.class));
        for (Topping topping : pizza.toppings) {
            assertTrue(expectedToppings.contains(topping.getClass()));
        }
    }
}
