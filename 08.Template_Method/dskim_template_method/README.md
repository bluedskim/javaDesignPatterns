# Tempate Method 패턴(김동석)

## 패턴 다이어그램

![Design patterns: Template Method](https://steemitimages.com/DQmRbBeqNZykcGGhvat7hHyfZhqFu3ypgGm19L6FkuvbFCG/templatemethod.png "Design patterns: Template Method")

(출처:https://steemit.com/design-patterns/@slawas/design-patterns-template-method)

## 특징/용도
1. behavioral design patterns의 일종
1. 상위의 추상클래스에서 처리할 로직의 뼈대(알고리즘)를 정의하고 자식 클래스에서 각 살들을 구현하도록하여 상위 처리로직의 아웃라인을 재사용.
1. 템플리트 메소드내에서 각 단게들에 대한 처리는 자식 클래스에게 맡기기 때문에 일종의 IoC(Inversion of Control)라고 할 수 있다.

## 

## 고려사항

1. 자식 객체들은 템플리트 메소드 자체를 override하면 안된다.
1. 부모 추상 객체를 인터페이스로 만들 수도 있다. 하지만 이 경우 모든 메소드는 public 으로 접근가능하므로 주의가 필요 

## 클래스 다이어그램

![Template Method 패턴(김동석)](https://www.plantuml.com/plantuml/png/hL9DIyD043sxls8eIDD3cdiLwK6mbq31_e5DTfgitKtAxgHGFq2XDmNnAAXdZmfU_4ir_GzkqrgK1l7WddRdpRptPcQxbhYXGYiOe1uhJWWXKfeBMDmyBsPltlpzykFslfmzjXXBfK1mQJG5ZJf2Ot-6bdMMCPAay0zyANA11bAYiUq4GI8fBQ9sdEiWKWKAEv8wEE4JVeXM9bcV4w79B1lckRj0-NHNpbxBwuVvonNi2gVaDQRkjCEmBKGJchrUH-k6iyruPCdmc21Mt5euuXhXZEsCYqZ968x9o2m1PtRgjTZE9daTbvaaoPKyHQ-rjmrNy-jNjJKePk8Bks1i9Hzo8_EbVhr0BUylT0EUZOOoIUaVATUhMsrkWBRYdkHI06r1RcQki9hf_hdlhzhxzjxuOwo6r_SFgdqmrdLEt3_y1000 "Template Method 패턴(김동석)")

## 소스
1. template method : Game.java.play()
1. target : Mario.java, Tankfight.java 
1. client : TemplateMethodTest.java

## 참고

* [wikipedia : Template method pattern](https://en.wikipedia.org/wiki/Template_method_pattern)
* [baeldung : Implementing the Template Method Pattern in Java](https://www.baeldung.com/java-template-method-pattern)
* [tutorialspoint : Design Patterns - Template Pattern](https://www.tutorialspoint.com/design_pattern/template_pattern.htm)
* [dzone : Using Template Method Design Pattern In Java](https://dzone.com/articles/using-template-method-design-pattern-in-java)
* [steemit : Design patterns: Template Method](https://steemit.com/design-patterns/@slawas/design-patterns-template-method)
