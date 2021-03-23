package net.dskim.desingpattern.template_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tankfight extends Game {
	@Override
	String initialize() {
		String rtn = "Tankfight initialize.";
		log.info(rtn);
		return rtn;
	}

	@Override
	String startPlay() {
		String rtn = "Tankfight startPlay.";
		log.info(rtn);
		return rtn;
	}

	@Override
	String endPlay() {
		String rtn = "Tankfight endPlay.";
		log.info(rtn);
		return rtn;
	}
}