package net.dskim.desingpattern.template_method.implement_interface;

/**
 * 템플리트 메소드가 선언된 부모 추상 클래스 
 */
public interface Game {
	String initialize();
	String startPlay();
	String endPlay();

	default String play() {
		String initializeResult = initialize();
		String startPlayeResult = startPlay();
		String endPlayResult = endPlay();

		return initializeResult	+ startPlayeResult + endPlayResult;
	}
}