package net.dskim.desingpattern.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorTest {
	static void printBeverage(BeverageBase beverage) {
		log.info("Beverage: {}, Cost: {}", beverage.getDescription(), beverage.getCost());
	}

	@Test
	public void decoratorTest() {
		BeverageBase espresso = new Espresso();
		BeverageBase blackTea = new BlackTea();
		BeverageBase greenTea = new GreenTea();

		printBeverage(espresso);
		printBeverage(blackTea);
		printBeverage(greenTea);

		BeverageBase capuccino = new SugarCondiment(new MilkCondiment(new Espresso()));
		printBeverage(capuccino);
		assertEquals("Small portion of strong coffee + Milk + Sugar", capuccino.getDescription());
		assertEquals(16.0, capuccino.getCost());

		BeverageBase greenTeaWithSugar = new SugarCondiment(new GreenTea());
		printBeverage(greenTeaWithSugar);
		assertEquals("Green leaf tea + Sugar", greenTeaWithSugar.getDescription());
		assertEquals(9.0, greenTeaWithSugar.getCost());

		BeverageBase greenTeaWithCholate = new ChocolateCondiment(new GreenTea());
		printBeverage(greenTeaWithCholate);
		assertEquals("Green leaf tea + Chocolate", greenTeaWithCholate.getDescription());
		assertEquals(12.0, greenTeaWithCholate.getCost());
	}
}
