# Factory Method 패턴(김동석)

![Factory design Pattern in Java – with examples](https://dotnettutorials.net/wp-content/uploads/2018/11/word-image-103.png "Factory design Pattern in Java – with examples")
(출처:https://dotnettutorials.net/lesson/abstract-factory-design-pattern-csharp/)
## 해결하려는 문제
1. 생성자를 직접 호출해서 객체를 생성하는 경우 해당 객체와 클라이언트가 강하게 결합되게 되어 확정성이 떨어진다.

## 개요
* 생성자를 호출하지 않고 생성하기 위한 패턴(생성될 클래스를 지정하지 않는다)
* 해당 클래스를 사용하는 클래스에 하드코딩을 없앨 수 있다.
## 클래스 다이어그램
![Factory Method 패턴(김동석)](https://www.plantuml.com/plantuml/png/XPBFIm915CVFpL_n4CBre7kN2A48BqAa_y2uyzpTsb_Dl2sM2WhtPc0T10FrtB508lybtVqVsbKplTWmXpTVFjzvN-PDJH6N5BeEd763V1b10ydo1QJFxsayrUQpnqN_BOd79SOiMo2W6r04Bhfjb6fNodsACRB9mV-liv0Bb60H1QggwwPDLjYk6BwhjvqGXRgoNVsIt_1JLBRfdNCYb9vY7T_F2aWchqdycVH6yuydE1ISK2j4sQeq6XKXYb2irwkkMyXIsrx6TxY1qBHuW7373feaRSy48VcjLc8FZ1aELmfER6au-u0BD8XxvbwcUHrokHV8K_o-JeujKvb8oq9RkrH-Q4K1BfqhvkY-N5w7t5OsgRR5LGp6rerMKsYX8YYNZtSpLF-QB_fnEXpakpigiHrgOyluT31Tz6QmeY7fZlDHJ5uW7NudNoDMGqzaF-e7 "Factory Method 패턴(김동석)")

## 소스
* Shape.java : 도형(인터페이스)
* 도형 객체들 : Shape.java 를 implement
  * Rectangle.java : 사각형
  * Circle.java : 원
  * Square.java : 정사각형
* ShapeFactory.java : 도형 팩토리(Virtual Constructor)

## 참고

* [refactoring.guru : Factory Method](https://refactoring.guru/design-patterns/factory-method)
* [tutorialspoint : Design Pattern - Factory Pattern](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)
* [wikipedia : Factory method pattern](https://en.wikipedia.org/wiki/Factory_method_pattern#Java)
* [baeldung : Introduction to Creational Design Patterns](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)