package net.dskim.desingpattern.template_method.implement_interface;

import lombok.extern.slf4j.Slf4j;

/**
 * 해당 클래스에 특화된 메소드가 구현되어있는 클래스
 */
@Slf4j
public class Mario implements Game {
	@Override
	public String initialize() {
		String rtn = "Mario initialize.";
		log.info(rtn);
		return rtn;
	}

	@Override
	public String startPlay() {
		String rtn = "Mario startPlay.";
		log.info(rtn);
		return rtn;
	}

	@Override
	public String endPlay() {
		String rtn = "Mario endPlay.";
		log.info(rtn);
		return rtn;
	}
}