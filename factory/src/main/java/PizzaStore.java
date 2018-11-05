public class PizzaStore {
    public Pizza orderPizza(String type) {
        System.out.println(String.format("Placing an order for one %s pizza", type));
        Pizza pizza = null;
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

        pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(String.format("Here's your %s pizza. Thank you, come again!\n:)", type));

        return pizza;
    }
}
