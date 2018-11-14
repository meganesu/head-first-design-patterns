public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Cheese Pizza";
        dough = new ThickCrustDough();
        sauce = new PlumTomatoSauce();
        toppings.add(new MozzarellaCheese());
    }
}
