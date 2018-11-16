public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        }
        else if (type.equals("seafood")) {
            pizza = new SeafoodPizza(ingredientFactory);
        }

        return pizza;
    }
}
