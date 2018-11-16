import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ChicagoPizzaIngredientFactoryTest {
    ChicagoPizzaIngredientFactory ingredientFactory;

    @Before
    public void setUp() {
        ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Test
    public void shouldReturnThinCrustDough() {
        Dough dough = ingredientFactory.createDough();
        assertThat(dough, instanceOf(ThickCrustDough.class));
    }

    @Test
    public void shouldReturnMarinaraSauce() {
        Sauce sauce = ingredientFactory.createSauce();
        assertThat(sauce, instanceOf(PlumTomatoSauce.class));
    }

    @Test
    public void shouldReturnReggianoCheese() {
        Cheese cheese = ingredientFactory.createCheese();
        assertThat(cheese, instanceOf(MozzarellaCheese.class));
    }

    @Test
    public void shouldReturnFreshClams() {
        Seafood seafood = ingredientFactory.createSeafood();
        assertThat(seafood, instanceOf(FrozenClams.class));
    }

    @Test
    public void shouldReturnPepperoni() {
        Pepperoni pepperoni = ingredientFactory.createPepperoni();
        assertThat(pepperoni, instanceOf(Pepperoni.class));
    }

    @Test
    public void shouldReturnMushrooms() {
        Vegetable vegetable = ingredientFactory.createVegetable();
        assertThat(vegetable, instanceOf(Mushrooms.class));
    }
}
