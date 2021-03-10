# Command 패턴(김동석)
## 용도
1. 어플리케이션을 통틀어 한 개의 인스턴스만 필요할 때
1. 그 한 개의 인스턴스를 쉽게 접근하고자 할 때
1. 어플리케이션의 전체 영역에서 사용할 수 있는 전역변수가 필요할 때

## 특징
1. 해당 클래스의 생성자는 직접 호출할 수 없음
1. 대신 해당 객체를 반환하는 public static 메소드를 만든다

## 고려사항
1. 객체지향 설계원칙에 위배
  * singleton 클래스는 상속 불가
1. "No control over creation"
1. dependency injection 불가

## 클래스 다이어그램
![Factory Method 패턴(김동석)](https://www.plantuml.com/plantuml/png/XPBFIm915CVFpL_n4CBre7kN2A48BqAa_y2uyzpTsb_Dl2sM2WhtPc0T10FrtB508lybtVqVsbKplTWmXpTVFjzvN-PDJH6N5BeEd763V1b10ydo1QJFxsayrUQpnqN_BOd79SOiMo2W6r04Bhfjb6fNodsACRB9mV-liv0Bb60H1QggwwPDLjYk6BwhjvqGXRgoNVsIt_1JLBRfdNCYb9vY7T_F2aWchqdycVH6yuydE1ISK2j4sQeq6XKXYb2irwkkMyXIsrx6TxY1qBHuW7373feaRSy48VcjLc8FZ1aELmfER6au-u0BD8XxvbwcUHrokHV8K_o-JeujKvb8oq9RkrH-Q4K1BfqhvkY-N5w7t5OsgRR5LGp6rerMKsYX8YYNZtSpLF-QB_fnEXpakpigiHrgOyluT31Tz6QmeY7fZlDHJ5uW7NudNoDMGqzaF-e7 "Factory Method 패턴(김동석)")

## 소스
* Shape.java : 도형(인터페이스)
* 도형 객체들 : Shape.java 를 implement
  * Rectangle.java : 사각형
  * Circle.java : 원
  * Square.java : 정사각형
* ShapeFactory.java : 도형 팩토리

## 참고

* [wikipedia : Command pattern](https://en.wikipedia.org/wiki/Command_pattern)
- [baeldung : The Command Pattern in Java](https://www.baeldung.com/java-command-pattern)
- [Alvin Alexander : A Java Command Design Pattern example](https://alvinalexander.com/java/java-command-design-pattern-in-java-examples/)
  - https://alvinalexander.com/java/java-action-abstractaction-actionlistener/