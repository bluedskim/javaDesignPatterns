package net.dskim.desingpattern.decorator;

class MilkCondiment extends CondimentsDecoratorBase {
	public MilkCondiment(BeverageBase beverage) {
		this.beverage = beverage;
		description = this.beverage.getDescription() + " + Milk";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 3;
	}
}