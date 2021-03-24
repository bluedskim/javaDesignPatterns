package net.dskim.desingpattern.template_method.extend_abstract;

import lombok.extern.slf4j.Slf4j;

/**
 * 해당 클래스에 특화된 메소드가 구현되어있는 클래스
 */
@Slf4j
public class Tankfight extends Game {
	@Override
	protected String initialize() {
		String rtn = "Tankfight initialize.";
		log.info(rtn);
		return rtn;
	}

	@Override
	protected String startPlay() {
		String rtn = "Tankfight startPlay.";
		log.info(rtn);
		return rtn;
	}

	@Override
	protected String endPlay() {
		String rtn = "Tankfight endPlay.";
		log.info(rtn);
		return rtn;
	}
}