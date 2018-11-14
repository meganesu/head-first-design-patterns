public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings.add(ingredientFactory.createCheese());
    }
}
