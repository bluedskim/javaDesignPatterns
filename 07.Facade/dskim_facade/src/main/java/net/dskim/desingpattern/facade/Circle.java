package net.dskim.desingpattern.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {

	@Override
	public String draw() {
		String result = "Circle::draw()";
		log.info(result);
		return result;
	}
}