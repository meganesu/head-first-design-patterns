public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Cheese Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();
        toppings.add(new ReggianoCheese());
    }
}
