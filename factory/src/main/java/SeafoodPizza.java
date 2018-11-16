public class SeafoodPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public SeafoodPizza(PizzaIngredientFactory ingredientFactory) {
        this.name = "Seafood Pizza";
        this.ingredientFactory = ingredientFactory;
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.toppings.add(ingredientFactory.createCheese());
        this.toppings.add(ingredientFactory.createSeafood());
    }
}
