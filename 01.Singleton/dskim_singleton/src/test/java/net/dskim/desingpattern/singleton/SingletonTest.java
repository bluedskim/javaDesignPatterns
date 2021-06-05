package net.dskim.desingpattern.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonTest {
	@Test
	public void singletonTest() {
		Coin coin1 = Coin.getInstance();
		Coin coin2 = Coin.getInstance();

		coin1.addMoreCoin();		
		log.info("coin1.getCoinCount()={}, coin2.getCoinCount()={}", coin1.getCoinCount(), coin2.getCoinCount());
		assertEquals(10, coin2.getCoinCount());

		coin2.deductCoin();
		log.info("coin1.getCoinCount()={}, coin2.getCoinCount()={}", coin1.getCoinCount(), coin2.getCoinCount());
		assertEquals(9, coin1.getCoinCount());

		log.info("coin1={}, coin2={}", coin1, coin2);
		assertEquals(coin1, coin2);	// 이것과 동일함 assertTrue(coin1.equals(coin2));
		assertSame(coin1, coin2);		
	}
}
