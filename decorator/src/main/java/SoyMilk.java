public class SoyMilk extends Beverage {
    private Beverage beverage;

    public SoyMilk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getSize() == Size.TALL) return beverage.cost() + 0.10;
        else if (beverage.getSize() == Size.GRANDE) return beverage.cost() + 0.15;
        else if (beverage.getSize() == Size.VENTI) return beverage.cost() + 0.20;
        return -1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy milk";
    }
}
