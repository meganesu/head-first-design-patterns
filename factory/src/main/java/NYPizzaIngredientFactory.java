public class NYPizzaIngredientFactory {
    public Seafood createSeafood() {
        return new FreshClams();
    }

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
