package net.dskim.desingpattern.template_method.extend_abstract;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemplateMethodTest {

	@Test
	void gamePlayTest() {
		Game mario = new Mario();
		Game tankfight = new Tankfight();
		
		assertEquals("Mario initialize.Mario startPlay.Mario endPlay.", mario.play());
		assertEquals("Tankfight initialize.Tankfight startPlay.Tankfight endPlay.", tankfight.play());
	}
}
