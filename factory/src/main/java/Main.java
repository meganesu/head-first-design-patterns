public class Main {
    public static void main(String args[]) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyPizzaStore.orderPizza("cheese");
        Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
    }
}
