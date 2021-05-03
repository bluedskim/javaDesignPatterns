package net.dskim.desingpattern.decorator;

class GreenTea extends BeverageBase {

	public GreenTea() {
		description = "Green leaf tea";
	}

	@Override
	public double getCost() {
		return 8;
	}
}