package net.dskim.desingpattern.template_method.implement_interface;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tankfight implements Game {
	@Override
	public String initialize() {
		String rtn = "Tankfight initialize.";
		log.info(rtn);
		return rtn;
	}

	@Override
	public String startPlay() {
		String rtn = "Tankfight startPlay.";
		log.info(rtn);
		return rtn;
	}

	@Override
	public String endPlay() {
		String rtn = "Tankfight endPlay.";
		log.info(rtn);
		return rtn;
	}
}