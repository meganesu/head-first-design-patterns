import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class NYPizzaIngredientFactoryTest {
    NYPizzaIngredientFactory ingredientFactory;

    @Before
    public void setUp() {
        ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Test
    public void shouldReturnThinCrustDough() {
        Dough dough = ingredientFactory.createDough();
        assertThat(dough, instanceOf(ThinCrustDough.class));
    }

    @Test
    public void shouldReturnMarinaraSauce() {
        Sauce sauce = ingredientFactory.createSauce();
        assertThat(sauce, instanceOf(MarinaraSauce.class));
    }

    @Test
    public void shouldReturnReggianoCheese() {
        Cheese cheese = ingredientFactory.createCheese();
        assertThat(cheese, instanceOf(ReggianoCheese.class));
    }

    @Test
    public void shouldReturnFreshClams() {
        Seafood seafood = ingredientFactory.createSeafood();
        assertThat(seafood, instanceOf(FreshClams.class));
    }

    @Test
    public void shouldReturnPepperoni() {
        Pepperoni pepperoni = ingredientFactory.createPepperoni();
        assertThat(pepperoni, instanceOf(Pepperoni.class));
    }

    @Test
    public void shouldReturnBellPeppers() {
        Vegetable vegetable = ingredientFactory.createVegetable();
        assertThat(vegetable, instanceOf(BellPeppers.class));
    }
}
