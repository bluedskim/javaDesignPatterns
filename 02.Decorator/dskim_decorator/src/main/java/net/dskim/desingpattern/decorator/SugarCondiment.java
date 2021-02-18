package net.dskim.desingpattern.decorator;

class SugarCondiment extends CondimentsDecoratorBase {

	private BeverageBase beverage;

	public SugarCondiment(BeverageBase beverage) {
		this.beverage = beverage;
		description = beverage.getDescription() + " + Sugar";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 1;
	}
}