# Decorator 패턴(김동석)

## 개요

### 왜 쓰는가?

When we wish to add, enhance or even remove the behavior or state of objects leave others unchanged

We use inheritance to extend the behavior of the class. This takes place at compile time, and all of the instances of that class get the extended behavior.

Decorator design patterns allow us to add functionality to an object (not the class) at runtime, and we can apply this customized functionality to an individual object based on our requirement and choice.

The decorator design pattern is a structural pattern, which provides a wrapper to the existing class.

Decorator design patterns create decorator classes, which wrap the original class and provide additional functionality by keeping the class methods' signature unchanged.

The decorator design pattern is structurally similar to the chain of responsibility pattern.

* PropertyChangeSupport 를 사용한 observer 패턴 샘플
* 클래스 다이어그램 <br/>
![Observer 패턴(김동석)](https://www.plantuml.com/plantuml/png/fP8zJWCn48LxdsBAtO8zGfG8qV4dSWBZVMmiRMnhF74K0H95IYHg2deEGCELWDo1JLWfcsY3a71Zothp-Sqy3wDebjcqfelh24vWMZs-hfPlsSVxm-VJyzVo9LTAhDJuLM6TW6-q0Lso3s1P74-qgt1gey21bJArZf7ECO-Z2iuiw5PHitRbura8deNYpxvH96zBqcNP3yxwhocOEj-MCwO-uJ-425bxpyR2rbNacdEkxhjjhSiTwhQlLYSJdFaeLp1m6y2M67QUtNDnaXez8KdUfLMjYJ_uwWowA0RzOrPTsqLnDpWKNdz8_kXWs4EuilbKtm00 "Observer 패턴(김동석)")
* 소스
  * observable : NewsAgency.java
  * observer : NewsChannel.java

## 참고

* [baeldung : The Decorator Pattern in Java](https://www.baeldung.com/java-decorator-pattern)

* [DZone : Decorator Design Pattern in Java](https://dzone.com/articles/decorator-design-pattern-in-java)

