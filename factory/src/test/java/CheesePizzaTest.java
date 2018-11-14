import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CheesePizzaTest {
    PizzaIngredientFactory ingredientFactory;

    @Test
    public void shouldReturnPizzaWithNYIngredientsWhenNYPizzaIngredientFactory() {
        ArrayList<Class> expectedClasses = new ArrayList<>();
        expectedClasses.add(ReggianoCheese.class);

        ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(ingredientFactory);

        assertThat(pizza.dough, instanceOf(ThinCrustDough.class));
        assertThat(pizza.sauce, instanceOf(MarinaraSauce.class));
        for (Topping topping : pizza.toppings) {
            assertTrue(expectedClasses.contains(topping.getClass()));
        }
    }

    @Test
    public void shouldReturnPizzaWithChicagoIngredientsWhenChicagoPizzaIngredientFactory() {
        ArrayList<Class> expectedClasses = new ArrayList<>();
        expectedClasses.add(MozzarellaCheese.class);

        ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = new CheesePizza(ingredientFactory);

        assertThat(pizza.dough, instanceOf(ThickCrustDough.class));
        assertThat(pizza.sauce, instanceOf(PlumTomatoSauce.class));
        for (Topping topping : pizza.toppings) {
            assertTrue(expectedClasses.contains(topping.getClass()));
        }

    }
}
