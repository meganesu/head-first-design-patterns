public abstract class Pizza {
    public abstract String getName();

    public void prepare() {
        System.out.println("Adding toppings to pizza...");
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
