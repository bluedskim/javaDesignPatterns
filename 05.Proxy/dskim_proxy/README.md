# Proxy 패턴(김동석)

## 패턴 다이어그램

![Proxy](https://refactoring.guru/images/patterns/content/proxy/proxy-2x.png?id=fb3d14e21c210a758d47 "Proxy")

"특정 클래스 대신 그 클래스와 동일한 인터페이스를 구현한 래퍼 _wrapper_ 클래스 _Proxy_ 를 이용한다" ([출처:https://refactoring.guru/design-patterns/proxy](https://refactoring.guru/design-patterns/proxy))

## 해결하려는 문제

1. 특정 객체에 대한 접근을 통제할 수 있는 일관된 방법이 필요할 때(보안, 권한 체크).
1. 네트워크 접속, 메모리에 탑재된 대형 객체, 파일, 그 외 생성에 큰 비용이 발생하거나 복제가 불가능한 리소스들 등에 대한 캐시가 필요할 때.
## 특징/용도
1. proxy클래스는 client의 요청을 subject에 단순히 전달하는 목적으로 사용하거나 subject의 메소드를 호출하기 이전, 이후에 특정 로직을 추가고자 할 때 사용한다.
1. client입장에서는 proxy를 사용하든 subject를 사용하든 기능상 차이는 없다(black box).
1. 지연된 초기화 Lazy initialization (virtual proxy) : 클래스 생성시 초기화 하는 것이 아니라 해당 객체의 메소드를 호출 할 때 초기화 하도록 함 

## 고려사항

1. 유사한 패턴과 비교
   * 어댑터 패턴은 subject와는 다른 인터페이스를 제공하는 반면 프록시는 동일한 인터페이스을 제공한다. 데코레이터 패턴은 subject보다 향상된(기능 추가) 인터페이스를 제공한다.
   * 파사드 패턴은 복잡한 엔티티들의 초기화에 대한 버퍼를 제공한다는 점에서 proxy패턴과 유사하다. 하지만 프록시는 동일한 인터페이스을 제공한다는 점에서 차이가 있다. 
   * 데코레이터 패턴과 프록시 패턴은 복합 _composition_ 을 사용한다는 점에서는 동일하지만 프록시 패턴은 subject 에 대한 라이프 사이클을 proxy내부에서 관리하는 반면 데코레이터 패턴에서는 클라이언트가 대상의 라이프사이클을 관리한다는 차이가 있다.
1. Proxy내에서 클라이언트 목록을 관리할 수도 있다. 사용하는 클라이언트가 없다면 리소스를 해제하는 등의 처리작업 수행하고자 할 때 유용하다.

## 클래스 다이어그램

![Proxy 패턴(김동석)](https://www.plantuml.com/plantuml/png/bP71IiD048RFxbCC1MbxQ78l8ZruwALGr1VOPAVDQZORTYR1e892RWhYKL3F7XMy-4erVGUt1Ymj23gduPzlvfzXHiJISM5Ic3fxLi7ozcLPl_SM7rUVTmzD_TGN8j4A0KtE5HWq4JhQb3YnYeHWpId-EYL1gT11mfpJC0pdcfCY2c9hmYWjKD6fDk69BEK1afvdKycCBYCnizOdq3pVD_LRS_EuUBs6NIKPUvtAHp2P14freJiU3utf-6M5pdp3JCO8XqYsS3uv5pjv4QKwXYDsEfj3xcoCHBs-k1GYJYKHZ56MrRywsal_J1uZyOekhLOhg5LQxCTtxo88DbVPgdsF4gtrO7yB5MkZWI-kzH5coh_u2m00 "Proxy 패턴(김동석)")

## 소스
1. Proxy : Subject를 대체하고자 하는 객체(Proxy.java)
1. Subject : 숨기고자 하는 객체(HeavyResource.java)
1. Resource : proxy와 subject가 구현해야 하는 인터페이스(Resource.java)

## 참고

* [wikipedia : Proxy pattern](https://en.wikipedia.org/wiki/Proxy_pattern)
* [refactoring.guru : Design Patterns / Structural Patterns / Proxy](https://refactoring.guru/design-patterns/proxy)
* [tutorialspoint : Design Patterns - Proxy Pattern](https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm)
* [baeldung : The Proxy Pattern in Java](https://www.baeldung.com/java-proxy-pattern)