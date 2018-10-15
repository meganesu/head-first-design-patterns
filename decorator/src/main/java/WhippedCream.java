public class WhippedCream extends Beverage {
    private Beverage beverage;

    public WhippedCream(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipped cream";
    }
}
