package net.dskim.desingpattern.decorator;

class ChocolateCondiment extends CondimentsDecoratorBase {

	private BeverageBase beverage;

	public ChocolateCondiment(BeverageBase beverage) {
		this.beverage = beverage;
		description = this.beverage.getDescription() + " + Chocolate";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 4;
	}
}