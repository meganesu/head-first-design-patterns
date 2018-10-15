public class SoyMilk extends Beverage {
    private Beverage beverage;

    public SoyMilk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy milk";
    }
}
