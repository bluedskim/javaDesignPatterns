package net.dskim.desingpattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Subject 객체
 */
@Slf4j
public class HeavyResource implements Resource {
	public HeavyResource() throws InterruptedException {
		super();
		log.info("HeavyResource 초기화 중...");
		// 초기화에 많은 시간이 걸린다고 가정함
		Thread.sleep(2000);
		log.info("HeavyResource 초기화 완료");
	}

	@Override
	public String process() {
		log.info("processing...");
		return "processed";
	}

}
