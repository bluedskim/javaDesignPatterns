package net.dskim.desingpattern.decorator;

abstract class BeverageBase {

	protected String description = "";

	public String getDescription() {
		return description;
	}

	/**
	 * 가격을 계산하는 로직은 하위 객체가 구현해야 한다.
	 * @return
	 */
	public abstract double getCost();
}