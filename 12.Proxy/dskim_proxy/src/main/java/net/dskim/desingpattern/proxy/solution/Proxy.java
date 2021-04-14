package net.dskim.desingpattern.proxy.solution;

import lombok.extern.slf4j.Slf4j;
import net.dskim.desingpattern.proxy.HeavyResource;
import net.dskim.desingpattern.proxy.Resource;

@Slf4j
public class Proxy implements Resource {
	private HeavyResource heavyResource;

	public Proxy() {
		super();
		log.info("Proxy 생성 완료");
	}

	@Override
	public String process() {
		if (heavyResource == null) {
			this.heavyResource = new HeavyResource();
		}
		return heavyResource.process();
	}
}
