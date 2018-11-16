public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
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
