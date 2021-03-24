package net.dskim.desingpattern.template_method.implement_interface;

import lombok.extern.slf4j.Slf4j;

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