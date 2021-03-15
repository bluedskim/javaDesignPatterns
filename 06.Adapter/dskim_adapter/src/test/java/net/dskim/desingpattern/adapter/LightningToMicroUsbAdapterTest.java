package net.dskim.desingpattern.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LightningToMicroUsbAdapterTest {
	// MicroUsbPhone 충전전용 메소드
	public String rechargeMicroUsbPhone(MicroUsbPhone microUsbPhone) {
		microUsbPhone.useMicroUsb();
		return microUsbPhone.recharge();
	}

	@Test
	public void lightningToMicroUsbAdapterTest() {
        Android android = new Android();
		String androidRechargeResult = rechargeMicroUsbPhone(android);
		log.info("androidRechargeResult={}", androidRechargeResult);
		assertEquals("Recharge finished", androidRechargeResult);

        Iphone iPhone = new Iphone();
		//rechargeMicroUsbPhone(iPhone); //iPhone에서 micro usb를 쓰려한다면 compile 에러 발생
		String iphoneWithMicroUsbRechargeResult = rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));
		log.info("iphoneWithMicroUsbRechargeResult={}", iphoneWithMicroUsbRechargeResult);
		assertEquals("Recharge finished", iphoneWithMicroUsbRechargeResult);
	}
}
