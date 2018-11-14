public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza() {
        name = "NY Pepperoni Pizza";
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();
        toppings.add(new ReggianoCheese());
        toppings.add(new Pepperoni());
    }
}
