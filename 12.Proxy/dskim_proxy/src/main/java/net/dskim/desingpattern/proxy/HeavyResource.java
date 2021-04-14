package net.dskim.desingpattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Subject 객체
 */
@Slf4j
public class HeavyResource implements Resource {
	public HeavyResource() {
		super();
		log.info("HeavyResource 초기화 중...");
		log.info("HeavyResource 초기화 완료");
	}

	@Override
	public String process() {
		log.info("processing...");
		return "processed";
	}

}
