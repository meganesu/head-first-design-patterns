public class Mocha extends Beverage {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }
}
