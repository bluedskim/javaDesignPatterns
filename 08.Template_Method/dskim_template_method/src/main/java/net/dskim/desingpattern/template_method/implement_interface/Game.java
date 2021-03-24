package net.dskim.desingpattern.template_method.implement_interface;

public interface Game {
	String initialize();
	String startPlay();
	String endPlay();

	public default String play() {
		String initializeResult = initialize();
		String startPlayeResult = startPlay();
		String endPlayResult = endPlay();

		return initializeResult	+ startPlayeResult + endPlayResult;
	}
}