package net.dskim.desingpattern.decorator;

abstract class BeverageBase {

	protected String description = "";

	public String getDescription() {
		return description;
	}

	public abstract double getCost();
}