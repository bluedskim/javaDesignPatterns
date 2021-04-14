package net.dskim.desingpattern.proxy.solution;

import net.dskim.desingpattern.proxy.HeavyResource;
import net.dskim.desingpattern.proxy.Resource;

public class Proxy implements Resource {
	private HeavyResource heavyResource;

	public Proxy() throws InterruptedException {
		if(heavyResource == null) {
			this.heavyResource = new HeavyResource();
		}
	}

	@Override
	public String process() {
		return heavyResource.process();
	}
}
