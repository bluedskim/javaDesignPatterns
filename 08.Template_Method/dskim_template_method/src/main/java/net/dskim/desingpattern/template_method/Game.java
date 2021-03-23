package net.dskim.desingpattern.template_method;

public abstract class Game {
	abstract String initialize();
	abstract String startPlay();
	abstract String endPlay();

	public final String play() {
		String initializeResult = initialize();
		String startPlayeResult = startPlay();
		String endPlayResult = endPlay();

		return initializeResult	+ startPlayeResult + endPlayResult;
	}
}