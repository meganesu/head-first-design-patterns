public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza() {
        name = "Chicago Clam Pizza";
        dough = new ThickCrustDough();
        sauce = new PlumTomatoSauce();
        toppings.add(new MozzarellaCheese());
        toppings.add(new FrozenClams());
    }
}
