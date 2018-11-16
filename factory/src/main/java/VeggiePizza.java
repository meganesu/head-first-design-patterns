public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.name = "Veggie Pizza";
        this.ingredientFactory = ingredientFactory;
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.toppings.add(ingredientFactory.createCheese());
        this.toppings.add(ingredientFactory.createVegetable());
    }
}
