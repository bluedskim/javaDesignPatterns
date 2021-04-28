# Singleton 패턴(김동석)

![singleton 일러스트](https://refactoring.guru/images/patterns/content/singleton/singleton-comic-1-en-2x.png?id=05678e879d13f7f6a377 "singleton 일러스트")

## 해결하려는 문제
1. 공유된 자원은 대체로 한정적이다. 이 자원을 무분별하게 사용하는 경우 쉽게 고갈될 수 있다. 

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
1. spring bean은 기본적으로 singleton으로 동작한다(https://www.baeldung.com/spring-bean-scopes)

## 클래스 다이어그램
Singleton 패턴(김동석)

![Singleton 패턴(김동석)](https://www.plantuml.com/plantuml/png/VP71IiD048RFxbCC1MbwQ7FFGGhnK0y1GLzWancJrUnkoKuAHGI5tXJ4ew2UFIfuyPNQz1tSscfZ3yvfvly_vbzcXuvbnRKkuKIPl2Is1fPthylPHp3_l5xSFpQpvvuGXK82qcEUWYQTKkN-IbnOT4AmufB-tLIGHAgWO1wxA0npnKMT3ZAhmxIi2Ts5qk6vdCX3SYetnvAPAkF4cRM-WURbePczDxTFyxSRs4V957IclWP9Ca3iGdSqYhJk-0TdfNGEOgiCN8gzSQKc7WPb63AlnROsl9Nz3LXbQrePFvcCjkvA3df-hjFIKsqu9pxQy2rYbUAT-2UePKsiGf28YQreP--tXOHrnXldIeZVKvwIO-Zt3zQvqKxoa0pwF_m2 "Singleton 패턴(김동석)")



## 소스
* 싱글톤 클래스 : Coin.java
* 클라이언트 : SingletonTest.java

## 참고

* [refactoring.guru : Singleton pattern](https://refactoring.guru/design-patterns/singleton)
* [wikipedia : Singleton pattern](https://en.wikipedia.org/wiki/Singleton_pattern#Java_Implementation_[7])