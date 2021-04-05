package net.dskim.desingpattern.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SetMenu implements Menu {
	List<Menu> menus ;
	
	public SetMenu() {
		menus = new ArrayList<>();
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	@Override
	public int getPrice() {
		int price = 0;
		for(Menu menu : menus) {
			price += menu.getPrice();
		}
		log.info("price=={}", price);
		return price;
	}
}