# Decorator 패턴(김동석)

![IEC 61131-3: The Decorator Pattern](https://stefanhenneken.files.wordpress.com/2019/02/picture03.png "IEC 61131-3: The Decorator Pattern")

## 해결하려는 문제
## 특징/용도
1. 런타임에 객체에 동적으로 기능을 추가하기 위한 structural 패턴
1. 래퍼wrapper 클래스로 구현. 
1. chain of responsibility pattern과 유사함
1. 생성자 혹은 다른 메소드에서 해당 클래스 자체를 인수로 받는 경우 데코레이터라 볼 수 있다(https://refactoring.guru/design-patterns/decorator/java/example)

## 고려사항

## 클래스 다이어그램
![Decorator 패턴(김동석)](https://www.plantuml.com/plantuml/png/dLJ1IiD053oxNx48OdjeUXSFOYjwAGZr1pQxpsHjDXlslGX51ONU5CIZe9uzAdZnbshx3wwsZSQcLSmfUJCxipkpP0j9ECfDmjiWhHDa7HzVFOu7BxNXw_dRzUreS5zdBDOAE9YC-jo02S5XUKInLSWOQKfWgL8CGe7ZCL666yrcf2dEmq1QqmoJ71Jsj6aUYMFH1jHHkY-8mAN83gtrBtpqS3CQF8ykxuPF5tnD2OBQQjy_GQSJABNEr_VsDenPzHiM8P8JahXC12BVXcDm8e9jWS1Fs4hcl9uaKBnBJgSHLu3IwOoqJJsQXucMCoW2Qd-XjNg15nxA-W5y45iMoJFE69lw9aBs3a1yUavMBIRlOEO0qVw9lEi0qj-LV-JGigdI1bB2egJvI4fXXTEFB-TMRALDVFQ5sBSzp8ErIhdw7uxOqKclogCq_xzyDu-4gz8l0_ynA2tPF6qqYejG0Srghu1c9LT02vhymGo2XKIsw2vCvETwNCulTRASMewNRK6g_F_d7G00 "Decorator 패턴(김동석)")
## 소스
* 꾸며질decorated 객체
  * BeverageBase.java : 부모 abstract 객체
  * BlackTea.java
  * Espresso.java
  * GreenTea.java
* 꾸미는decorator 객체 
  * CondimentsDecoratorBase.java : 부모 abstract 객체
  * CholateCondiment.java
  * MilkCondiment.java
  * SugarCondiment.java

## 참고

* [baeldung : The Decorator Pattern in Java](https://www.baeldung.com/java-decorator-pattern)

* [DZone : Decorator Design Pattern in Java](https://dzone.com/articles/decorator-design-pattern-in-java)

