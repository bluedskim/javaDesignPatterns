package net.dskim.desingpattern.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CompositeTest {

	@Test
	void compositeTest() {
		Menu rice = new Rice(1);
		Menu ramen = new Noodle(2);
		Menu jjajang = new Noodle(3);

		AggregateMenu ramenRice = new SetMenu();
		ramenRice.addMenu(ramen);
		ramenRice.addMenu(rice);

		AggregateMenu jjajangRice = new SetMenu();
		jjajangRice.addMenu(jjajang);
		jjajangRice.addMenu(rice);

		List<Menu> orderedMenus = new ArrayList<>();
		orderedMenus.add(ramen);//2
		orderedMenus.add(ramenRice);//3
		orderedMenus.add(jjajangRice);//4

		int totalPrice = 0 ;

		for(Menu menu : orderedMenus) {
			totalPrice += menu.getPrice();
		}

		assertEquals(9, totalPrice);
	}
}
