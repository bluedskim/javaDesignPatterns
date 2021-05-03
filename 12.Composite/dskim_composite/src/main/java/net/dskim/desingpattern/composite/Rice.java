package net.dskim.desingpattern.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rice implements Menu {
	int price;
	
	public Rice(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		log.info("price=={}", price);
		return price;
	}
}