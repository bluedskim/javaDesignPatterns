package net.dskim.desingpattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Android implements MicroUsbPhone {
	private boolean isConnected;

	@Override
	public void useMicroUsb() {
		isConnected = true;
		log.info("MicroUsb connected");
	}

	@Override
	public String recharge() {
		if (isConnected) {
			log.info("Recharge started");
			log.info("Recharge finished");
			return "Recharge finished";
		} else {
			log.info("Connect MicroUsb first");
			return "Connect MicroUsb first";
		}
	}
}
