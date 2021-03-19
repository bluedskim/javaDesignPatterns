package net.dskim.desingpattern.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

public class ShapeMakerTest {

	@Test
	public void ShapeMakerFacadeTest() {
		ShapeMaker shapeMaker = new ShapeMaker();
		assertEquals("Circle::draw()", shapeMaker.drawCircle());
		assertEquals("Rectangle::draw()", shapeMaker.drawRectangle());
		assertEquals("Square::draw()", shapeMaker.drawSquare());
		assertEquals("Circle::draw()Rectangle::draw()Square::draw()", shapeMaker.drawAllShape());
	}
}
