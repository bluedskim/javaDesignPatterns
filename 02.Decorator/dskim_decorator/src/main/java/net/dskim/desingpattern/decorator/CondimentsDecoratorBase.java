package net.dskim.desingpattern.decorator;

/**
 * 데코레이터 객체
 */
abstract class CondimentsDecoratorBase extends BeverageBase {
	BeverageBase beverage;

	/**
	 * 생성자에서 BeverageBase의 참조를 받아서 멤버변수에 할당
	 * @param beverage
	 */
	protected CondimentsDecoratorBase(BeverageBase beverage) {
		this.beverage = beverage;
	}
}