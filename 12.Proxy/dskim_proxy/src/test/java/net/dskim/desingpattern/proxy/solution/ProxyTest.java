package net.dskim.desingpattern.proxy.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.dskim.desingpattern.proxy.Resource;

public class ProxyTest {

	@Test
	void heavyResourceTest() throws InterruptedException {
		Resource heavyResource = new Proxy();	
		assertEquals("processed", heavyResource.process());
		assertEquals("processed", heavyResource.process());
	}
}
