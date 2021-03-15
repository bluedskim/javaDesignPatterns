package net.dskim.desingpattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	private final LightningPhone lightningPhone;

	public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}

	@Override
	public void useMicroUsb() {
		log.info("MicroUsb connected");
		lightningPhone.useLightning();
	}

	@Override
	public String recharge() {
		return lightningPhone.recharge();
	}
}
