public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "Chicago Veggie Pizza";
        dough = new ThickCrustDough();
        sauce = new PlumTomatoSauce();
        toppings.add(new MozzarellaCheese());
        toppings.add(new Mushrooms());
    }
}
