# Observer 패턴(김동석)
![Design Pattern: The Observer Pattern](https://dev-to-uploads.s3.amazonaws.com/i/0umqa0oz6wf95h6aza4j.jpeg "Design Pattern: The Observer Pattern")
(출처:https://dev.to/danlee0528/design-pattern-the-observer-pattern-3oha)
## 해결하려는 문제 : 알림의 주체는 누구인가?

* push vs poll
  
  어떤 이벤트가 발생하면 진행되어야 할 후속 이벤트들이 있다면 이벤트를 발생하는쪽이 알려줘야(Push) 하는가? 아니면 이벤트를 수신하는 쪽이 이벤트를 관찰(Poll)하고 있어야 하는가?

* 알려줘야 할 대상(Subscriber)들을 소스코드에 하드코딩하여 관리해야 하는가

## 특징/용도

1. publisher-subscriber(pub-sub)이라고도 한다.
1. 객체들은 one(publisher)-to-many(subscriber) 관계를 가진다.
1. subscriber는 publisher알지만 publisher는 subscriber를 알지 못한다. 즉 관계는 단방향이다.

## 고려사항

1. event driven아키텍처의 분산 이벤트 관리에서 많이 사용된다(https://en.wikipedia.org/wiki/Observer_pattern)
2. 동시성 처리를 위해 observer가 subject-events를 수신할 때 멀티쓰레드로 동작할 필요도 있다.

## 클래스 다이어그램

![Observer 패턴(김동석)](https://www.plantuml.com/plantuml/png/fLB1IWCn4BtdAq91sZsuU--XL5JemMgnNv1kfhlHJR8aiokB2WgzAOX7GJrxLF3YBzNjFvZMGhUo5S6vP9YyUNapBrsBp60c4teqic1oC7Hs-pARlBUc7rUVTm_bvCaZ91OSACWK2of1Zi3OzHB6cbj2K602ln75mBYxY15Jsmw2I62SZVnGos2KPC3jgP312SlP7bWHgG531ACi6Mlj4be-tvUJj_BcSVfwJRSuGsWr2XT-l-zptgJDNgyjPSFf5ShXnom4EZ0w1OF5RinK10V28YWmX8G9ivOUmfdTYK251JqdrCKwV9YbgJP8xVUvGEHQSCeuhoTkrPTf6YRUgjs0r3dyXy42phMtXcY4YgXokKSkgsFDsnKaoxcME8oXhoqUGmXgGR1YJDUU_Q5YFtTu2ZbwLRPeAU8FkYgBzlrE_Pf9LRRlNtGscLTlajxUQ7ON57TV_0i0 "Observer 패턴(김동석)")

## 소스
  * PropertyChangeSupport 를 사용한 observer 패턴 샘플
  * observable(Subject, Publisher) : NewsAgency.java
  * observer(Listener, Subscriber) : NewsChannel.java

## 참고

* [refactoring.guru : Observer](https://refactoring.guru/design-patterns/observer)
* [baeldung : The Observer Pattern in Java](https://github.com/eugenp/tutorials/tree/master/patterns/design-patterns-behavioral/src/main/java/com/baeldung/observer)
* [wikipedia : Observer pattern](https://en.wikipedia.org/wiki/Observer_pattern)


