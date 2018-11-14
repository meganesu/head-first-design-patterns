import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<Topping> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough);
        System.out.println("Adding " + sauce);
        System.out.println("Adding toppings to pizza...");
        for (Topping topping : toppings) {
            System.out.println("   " + topping.toString());
        }
    }

    public void bake() {
        System.out.println("Baking at 350 degrees for 25 minutes");
    }

    public void cut() {
        System.out.println("Cutting pizza into slices");
    }

    public void box() {
        System.out.println("Boxing up pizza");
    }
}
