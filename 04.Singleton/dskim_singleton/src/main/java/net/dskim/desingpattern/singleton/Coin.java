package net.dskim.desingpattern.singleton;

public class Coin {
	private static final int ADD_MORE_COIN = 10;
	private int coinCount;
	private static Coin instance = new Coin(); // Eagerly Loading of singleton instance

	private Coin() {
		// private to prevent anyone else from instantiating
	}

	public static Coin getInstance() {
		return instance;
	}

	public int getCoinCount() {
		return coinCount;
	}

	public void addMoreCoin() {
		coinCount += ADD_MORE_COIN;
	}

	public void deductCoin() {
		coinCount--;
	}
}
