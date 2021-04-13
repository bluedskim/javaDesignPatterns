package net.dskim.desingpattern.state.solution;

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

		pkg.setState(new DeliveredState());
		log.info("state={}", pkg.getState());
		assertEquals("orderer", pkg.getNotifyGetterList());

		pkg.setState(new ReceivedState());
		log.info("state={}", pkg.getState());
		assertEquals("orderer,manager", pkg.getNotifyGetterList());

		/* //CancelState를 추가하는 경우에도 Package 소스를 수정할 필요가 없다
		pkg.setState(new CancelState());
		log.info("state={}", pkg.getState());
		assertEquals("shipper,manager", pkg.getNotifyGetterList());
		*/
	}
}
