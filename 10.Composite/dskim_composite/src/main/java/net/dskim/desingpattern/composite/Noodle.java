package net.dskim.desingpattern.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Noodle implements Menu {
	int price;
	
	public Noodle(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		log.info("price=={}", price);
		return price;
	}
}