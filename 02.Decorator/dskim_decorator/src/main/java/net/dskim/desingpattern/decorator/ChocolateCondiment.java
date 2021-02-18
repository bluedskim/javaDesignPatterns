package net.dskim.desingpattern.decorator;

class ChocolateCondiment extends CondimentsDecoratorBase {
	public ChocolateCondiment(BeverageBase beverage) {
		this.beverage = beverage;
		description = this.beverage.getDescription() + " + Chocolate";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 4;
	}
}