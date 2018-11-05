public class NYPizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        else if (type.equals("seafood")) {
            pizza = new NYClamPizza();
        }

        return pizza;
    }
}
