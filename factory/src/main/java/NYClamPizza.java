public class NYClamPizza extends Pizza {
    public NYClamPizza() {
        name = "NY Clam Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();
        toppings.add(new ReggianoCheese());
        toppings.add(new FreshClams());
    }
}
