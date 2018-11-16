public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.name = "Pepperoni Pizza";
        this.ingredientFactory = ingredientFactory;
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.toppings.add(ingredientFactory.createCheese());
        this.toppings.add(ingredientFactory.createPepperoni());
    }
}
