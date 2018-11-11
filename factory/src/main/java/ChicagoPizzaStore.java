public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        else if (type.equals("seafood")) {
            pizza = new ChicagoClamPizza();
        }

        return pizza;
    }
}
