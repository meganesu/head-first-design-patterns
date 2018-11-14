public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        name = "Chicago Pepperoni Pizza";
        dough = new ThickCrustDough();
        sauce = new PlumTomatoSauce();
        toppings.add(new MozzarellaCheese());
//        toppings.add("Pepperoni");
    }
}
