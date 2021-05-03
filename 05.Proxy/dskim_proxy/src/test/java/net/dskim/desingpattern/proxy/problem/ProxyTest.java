package net.dskim.desingpattern.proxy.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.dskim.desingpattern.proxy.HeavyResource;
import net.dskim.desingpattern.proxy.Resource;

public class ProxyTest {

	@Test
	void heavyResourceTest() throws InterruptedException {
		Resource heavyResource1 = new HeavyResource();	
		assertEquals("processed", heavyResource1.process());	
		Resource heavyResource2 = new HeavyResource();	
		assertEquals("processed", heavyResource2.process());
	}
}
