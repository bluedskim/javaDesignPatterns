package net.dskim.desingpattern.facade;

/**
 * facade용 클래스
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public String drawCircle() {
		return circle.draw();
	}

	public String drawRectangle() {
		return rectangle.draw();
	}

	public String drawSquare() {
		return square.draw();
	}

	/**
	 * 복잡한 로직을 감싼 facade 메소드
	 * @return
	 */
	public String drawAllShape() {
		return circle.draw() + rectangle.draw() + square.draw();
	}
}