# Proxy 패턴(김동석)

## 패턴 다이어그램

![Proxy](https://refactoring.guru/images/patterns/content/proxy/proxy-2x.png?id=fb3d14e21c210a758d47 "Proxy")

"특정 클래스 대신 그 클래스에 대한 인터페이스로 동작하는 래퍼 _wrapper_ 클래스를 이용한다"

## 특징/용도
1. proxy클래스는 요청을 그 대상엑 단순히 전달하는 목적(캐쉬)으로 사용하거나 대상 객체의 메소드를 호출하기 이전, 이후에 로직을 추가할 수 있다.
1. client입장에서는 proxy를 사용하건나 proxy의 대상을 직접 사용하거나 차이는 없다.
1. 지연된 초기화 Lazy initialization (virtual proxy) : 실제로 해당 객체가 필요한 시기에 초기화 하도록 한다.

## 해결하려는 문제

1. 특정 객체에 대한 접근을 통제할 수 있는 일관된 방법이 필요할 때(보안, 권한 체크).
1. 네트워크 접속, 메모리에 탑재된 대형 객체, 파일, 그 외 생성에 큰 비용이 발생하거나 복제가 불가능한 리소스들 등에 대한 캐시가 필요할 때.

## 고려사항

1. 유사한 패턴과 비교
   * Adapter provides a different interface to the wrapped object, Proxy provides it with the same interface, and Decorator provides it with an enhanced interface.
   * Facade is similar to Proxy in that both buffer a complex entity and initialize it on its own. Unlike Facade, Proxy has the same interface as its service object, which makes them interchangeable.
   * Decorator and Proxy have similar structures, but very different intents. Both patterns are built on the composition principle, where one object is supposed to delegate some of the work to another. The difference is that a Proxy usually manages the life cycle of its service object on its own, whereas the composition of Decorators is always controlled by the client.
1. 현재 Proxy를 사용중인 클라이언트 목록을 관리할 수 있다. ex) 해당 목록이 비었다면 리소스를 해제하는 등의 처리작업 수행

## 클래스 다이어그램

![Proxy 패턴(김동석)](https://www.plantuml.com/plantuml/png/dLEzJiCm49xnKrYLK9EXoLuGwb293XGgu0MS-9gOnabbNu8gG0Af6qY84GawCuB4mYkLz1rm4re8b85wEj_TztDdkQMHAKnbH8-G8T3PpTDi_6fDtoxVR-_pyQDDI2WuK9137549qWEbgoaC4wu9GO4H_CaI0kEWQ8Wur4tN3GI6gUVuYNIzA0Mk1qAw9onZRT0YY7iC4LIiIJz9J43poLq-Vicl7wRFLtIJ6mchDZB7wNOTpkkqtkaqfQmPiqJ41j1dFj0UymSiWDBH6TaOfbuaVEDGYJYW0U1-Wg8_seMvrfxGQDdaWX0_ObhJ0yKLyFMmROW4PB0s_X1y4DcwwC-n2vmIsPoYiWa_LGfYB2vRI-ui4PngADDM1H33QH7Oo-PAELY0x7yQBL37e75kjTHVPCgsYipskUDyVvKLrHzxNz5HsImXNmuQZPt5LAkp5SRV1TA2c9jVz040 "Proxy 패턴(김동석)")

## 소스
1. Proxy : Subject를 대체하고자 하는 객체
1. Subject : 숨기고자 하는 객체

## 참고

* [wikipedia : Proxy pattern](https://en.wikipedia.org/wiki/Proxy_pattern)
* [refactoring.guru : Design Patterns / Behavioral Patterns / Proxy](https://refactoring.guru/design-patterns/proxy)
* [tutorialspoint : Design Patterns - Proxy Pattern](https://www.tutorialspoint.com/design_pattern/state_pattern.htm)