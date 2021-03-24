package net.dskim.desingpattern.template_method.extend_abstract;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mario extends Game {
	@Override
	protected String initialize() {
		String rtn = "Mario initialize.";
		log.info(rtn);
		return rtn;
	}

	@Override
	protected String startPlay() {
		String rtn = "Mario startPlay.";
		log.info(rtn);
		return rtn;
	}

	@Override
	protected String endPlay() {
		String rtn = "Mario endPlay.";
		log.info(rtn);
		return rtn;
	}
}