package net.dskim.desingpattern.template_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mario extends Game {
	@Override
	String initialize() {
		String rtn = "Mario initialize.";
		log.info(rtn);
		return rtn;
	}

	@Override
	String startPlay() {
		String rtn = "Mario startPlay.";
		log.info(rtn);
		return rtn;
	}

	@Override
	String endPlay() {
		String rtn = "Mario endPlay.";
		log.info(rtn);
		return rtn;
	}
}