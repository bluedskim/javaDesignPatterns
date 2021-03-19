# Facade(대문) 패턴(김동석)

## Facade 패턴 다이어그램

![Facade Design Pattern | Introduction](https://media.geeksforgeeks.org/wp-content/uploads/facadeA.png "Facade Design Pattern | Introduction")

(출처:https://www.geeksforgeeks.org/facade-design-pattern-introduction/)
## 용도/목적
1. 복잡한 구현을 클라이언트와 분리
1. 클라이언트의 의존성을 하나로 줄이기 위함

## 구성요소
1. facade : target의 여러 인터페이스를 조합한 루틴이 정의된 객체
1. target : 원래는 클라이언트가 직접 참조해야 하는 객체
1. client : facade를 통해 target들을 사용(호출)하는 객체
## 고려사항

다른 유사한 패턴과 비교해보자

1. Decorator : 원래의 소스를 감싸는 방식으로 인터페이스에 동적으로 기능을 추가한다.
1. Delegation : 상속을 통한 조합
1. Adapter : 어떤 인터페이스를 다른 인터페이스로 변환

## 클래스 다이어그램

![Facade 패턴(김동석)](https://www.plantuml.com/plantuml/png/hLFBIWCn55qtNn4AqkcYC_iYOi551Gi5wmTa9hUJw2GPaaoXgA3GdOAu5DIrImKt_bAT_eFfaqvjYmMpkxdtd7Dp3ZaqbcYRYGGtA4ajQ3owVniDFhtXryttmrC-UAaYn3W532ArVIn0XA1DySeoHGr2bji4jl0m8DGrcBMfgGT1p2tBGZzI8WYJ3AYvu28u9pro18R7iasiev46TPKQy-MlZ_dW8xzx7hxVuZrAB7ZblZj-g-LJMi6LPhCkHDcjYxXqW2w909_mc5d9PTncIWA-HALJgrs9DKICw1YyAYhr5ASuCx0OTfVNoomj7cbrPiA_aCndfnnHGep1n-dkwbDaGr8zxk-kkQ3hg7bxdemZIpNlEGTnbqkIhBgK54fKsapbRKLM_t7f3XYxneL2Cbun9x5SJKHMjjs_ylrPDgW8dNGsBxDkUfRKaiXluskrWnMljurFdZo65DGGEWH9tOVz0G00 "Facade 패턴(김동석)")

## 소스
1. facade : ShapeMaker.java
1. target : Shape.java, Circle.java, Rectangle.java, Square.java 
1. client : ShapeMakerTest.java

## 참고

* [wikipedia : Facade pattern](https://en.wikipedia.org/wiki/Facade_pattern)
* [baeldung : Facade Design Pattern in Java](https://www.baeldung.com/java-facade-pattern)
* [tutorialspoint : Design Patterns - Facade Pattern](https://www.tutorialspoint.com/design_pattern/facade_pattern.htm)