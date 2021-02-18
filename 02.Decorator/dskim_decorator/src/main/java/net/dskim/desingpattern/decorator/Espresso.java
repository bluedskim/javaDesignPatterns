package net.dskim.desingpattern.decorator;

class Espresso extends BeverageBase {

	public Espresso() {
		description = "Small portion of strong coffee";
	}

	@Override
	public double getCost() {
		return 12;
	}
}