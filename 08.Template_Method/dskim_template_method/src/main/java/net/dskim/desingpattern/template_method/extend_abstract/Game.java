package net.dskim.desingpattern.template_method.extend_abstract;

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