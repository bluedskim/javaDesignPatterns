package net.dskim.desingpattern.state.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateTest {

	@Test
	void stateTest() {
		Package pkg = new Package();
		
		log.info("state={}", pkg.getState());
		assertEquals("shipper", pkg.getNotifyGetterList());

		pkg.setState("DeliveredState");
		log.info("state={}", pkg.getState());
		assertEquals("orderer", pkg.getNotifyGetterList());

		pkg.setState("ReceivedState");
		log.info("state={}", pkg.getState());
		assertEquals("orderer,manager", pkg.getNotifyGetterList());

	}
}
