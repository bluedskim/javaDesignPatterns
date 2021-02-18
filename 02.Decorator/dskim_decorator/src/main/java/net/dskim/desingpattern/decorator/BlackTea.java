package net.dskim.desingpattern.decorator;

class BlackTea extends BeverageBase {

	public BlackTea() {
		description = "Black tea from teabag";
	}

	@Override
	public double getCost() {
		return 5;
	}
}