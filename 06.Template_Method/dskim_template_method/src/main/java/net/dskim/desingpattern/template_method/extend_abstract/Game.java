package net.dskim.desingpattern.template_method.extend_abstract;

/**
 * 템플리트 메소드가 선언된 부모 추상 클래스 
 */
public abstract class Game {
	protected abstract String initialize();
	protected abstract String startPlay();
	protected abstract String endPlay();

	public final String play() {
		String initializeResult = initialize();
		String startPlayeResult = startPlay();
		String endPlayResult = endPlay();

		return initializeResult	+ startPlayeResult + endPlayResult;
	}
}