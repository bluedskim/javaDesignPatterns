package net.dskim.desingpattern.template_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

	@Test
	public void gamePlayTest() {
		Game mario = new Mario();
		Game tankfight = new Tankfight();
		
		assertEquals("Mario initialize.Mario startPlay.Mario endPlay.", mario.play());
		assertEquals("Tankfight initialize.Tankfight startPlay.Tankfight endPlay.", tankfight.play());
	}
}
