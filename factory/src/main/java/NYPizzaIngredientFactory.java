public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Seafood createSeafood() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() { return new Pepperoni(); }

    @Override
    public Vegetable createVegetable() { return new BellPeppers(); }
}
