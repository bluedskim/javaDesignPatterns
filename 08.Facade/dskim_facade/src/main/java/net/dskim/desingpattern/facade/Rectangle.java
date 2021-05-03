package net.dskim.desingpattern.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {

	@Override
	public String draw() {
		String result = "Rectangle::draw()";
		log.info(result);
		return result;
	}
}