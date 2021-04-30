package net.dskim.desingpattern.decorator;

class ChocolateCondiment extends CondimentsDecoratorBase {
	/**
	 * 생성자에서 해당 클래스 자체를 인수로 받는다
	 */
	public ChocolateCondiment(BeverageBase beverage) {
		super(beverage);
		description = beverage.getDescription() + " + Chocolate";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 4;
	}
}