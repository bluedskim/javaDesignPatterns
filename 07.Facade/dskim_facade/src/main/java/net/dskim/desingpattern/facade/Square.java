package net.dskim.desingpattern.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape {

	@Override
	public String draw() {
		String result = "Square::draw()";
		log.info(result);
		return result;
	}
}