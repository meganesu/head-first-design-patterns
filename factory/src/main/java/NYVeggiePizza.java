public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "NY Veggie Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();
        toppings.add(new ReggianoCheese());
        toppings.add(new BellPeppers());
    }
}
