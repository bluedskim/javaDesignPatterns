package net.dskim.desingpattern.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryMethodTest {
	@Test
	public void decoratorTest() {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Circle
		String drawResult = shape1.draw();
		log.info("className={}, drawResult={}", shape1.getClass().getSimpleName(), drawResult);
		assertEquals("draw Circle", drawResult);

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Rectangle
		drawResult = shape2.draw();
		log.info("className={}, drawResult={}", shape2.getClass().getSimpleName(), drawResult);
		assertEquals("draw Rectangle", drawResult);

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of square
		drawResult = shape3.draw();
		log.info("className={}, drawResult={}", shape3.getClass().getSimpleName(), drawResult);
		assertEquals("draw Square", drawResult);
	}
}
