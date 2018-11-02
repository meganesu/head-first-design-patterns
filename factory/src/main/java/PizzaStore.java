public class PizzaStore {
    public Pizza orderPizza(String type) {
        System.out.println(String.format("Placing an order for one %s pizza", type));
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        else if (type.equals("seafood")) {
            pizza = new SeafoodPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(String.format("Here's your %s pizza. Thank you, come again!\n:)", type));

        return pizza;
    }
}
