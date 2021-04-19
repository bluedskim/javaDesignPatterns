package net.dskim.desingpattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * Subject 객체
 * 
 */
@Slf4j
public class HeavyResource implements Resource {
	/**
	 * 생성자 호출시 초기화에 많은 시간과 자원이 소모된다고 가정한다.
	 */	
	public HeavyResource() {
		super();
		log.info("HeavyResource 초기화 중...");
		log.info("HeavyResource 초기화 완료");
	}

	/**
	 * 실제 어떤 처리를 하는 메소드
	 */
	@Override
	public String process() {
		log.info("processing...");
		return "processed";
	}

}
