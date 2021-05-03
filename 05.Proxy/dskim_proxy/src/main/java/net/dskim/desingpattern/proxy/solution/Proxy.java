package net.dskim.desingpattern.proxy.solution;

import lombok.extern.slf4j.Slf4j;
import net.dskim.desingpattern.proxy.HeavyResource;
import net.dskim.desingpattern.proxy.Resource;

/**
 * Proxy객체도 역시 Resource 인터페이스를 구현해야 한다.
 */
@Slf4j
public class Proxy implements Resource {
	/**
	 * Proxy객체가 다루어야 할 Subject객체
	 */
	private HeavyResource heavyResource;

	public Proxy() {
		super();
		log.info("Proxy 생성 완료");
	}

	/**
	 * 처리 메소드를 호출 시
	 * 지연된 초기화Lazy initialize 하도록 한다.
	 */
	@Override
	public String process() {
		// null check 하여 불필요한 초기화를 피한다.
		if (heavyResource == null) {
			this.heavyResource = new HeavyResource();
		}
		return heavyResource.process();
	}
}
