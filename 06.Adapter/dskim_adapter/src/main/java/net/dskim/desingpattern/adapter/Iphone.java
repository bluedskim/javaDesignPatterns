package net.dskim.desingpattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Iphone implements LightningPhone {
	private boolean isConnected;

	@Override
	public void useLightning() {
		isConnected = true;
		log.info("Lightning connected");
	}

	@Override
	public String recharge() {
		if (isConnected) {
			log.info("Recharge started");
			log.info("Recharge finished");
			return "Recharge finished";
		} else {
			log.info("Connect Lightning first");
			return "Connect Lightning first";
		}
	}
}
