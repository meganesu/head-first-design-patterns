public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Seafood createSeafood() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() { return new Pepperoni(); }

    @Override
    public Vegetable createVegetable() { return new Mushrooms(); }
}
