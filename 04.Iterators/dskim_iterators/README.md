# Iterator 패턴(김동석)

## 패턴 다이어그램

![Iterators implement various traversal algorithms. Several iterator objects can traverse the same collection at the same time.](https://refactoring.guru/images/patterns/diagrams/iterator/solution1-2x.png "Iterators implement various traversal algorithms. Several iterator objects can traverse the same collection at the same time.")

"하나의 집합Collection의 모든 요소를 모두 접근하는 방법은 여러가지가 있을 수 있다"
([출처:https://refactoring.guru/design-patterns/iterator](https://refactoring.guru/design-patterns/iterator))

## 해결하려는 문제
1. 집합collection의 각각 항목 모두를 접근할 수 있는 일관된 방법을 제공. 

## 특징/용도
1. behavioral design patterns의 하나
1. iterator는 해당 집합의 실제 구현과는 무관하다(Information Hiding, Separation of concerns).

## 고려사항

1. Java 1.2 부터 Iterable, Iterator 인터페이스가 포함되어 있으므로 직접 만들 필요가 없다.

## 클래스 다이어그램

![Iterator 패턴(김동석)](https://www.plantuml.com/plantuml/png/ZPAnIWD148Rhx5CC0J4fSh7M61GDn29gOISMUxUJtEhjRhYT4uCA2kaKn59GQqi56ryfdk_WdcSk5q5ngzcP_V_vPjWrIpocH4MmHHXpCZ5yN3zzZ5zhaxUBzvkxTFnGPooK0W7La4QWKFaOs_aKXKPOnaXIX7yPXSW5nX0I3UroipcG52Q-5nZLzAC4XJsIgdd8Z_acMZdGkvoSbRQiRumB87syJSSlwTNzvFaI5WGdh5L7xdYzdYV48YnskyjALHqlaze9-ZoOqRGwRJXbbM7YHp80tvW8kOQGssqyeLfzfIXrGEUP2ZjdB8YujR0UntnKpFKlcnt_40EQUh5AVjy_09vvkOH31Aa5di0gBAralNv0-n6szihGtBSKSsUQhSXBI4PUCPrxAB_ZhDqy-ORHnAN6CdgXpC7Ayfbw-cWFBMNQOoD5Fa2vaYkcpD0wQpH-z6N5xcR5QOgnkIwDHhiO_vVAbsWDjN3VzXC0 "Iterator 패턴(김동석)")

## 소스
1. target : 
    * MyIterable.java : 컨테이너가 구현해야하는 인터페이스
    * ArrayContainer.java : 배열을 가지고 있는 객체
    * ArrayIterator.java : 배열학목을 순서대로 접근하기 위한 iterator
    * ReverseArrayIterator.java : 배열학목을 역순으로 접근하기 위한 iterator
1. client : IteratorTest.java

## 참고

* [wikipedia : Iterator pattern](https://en.wikipedia.org/wiki/Iterator_pattern)
* [tutorialspoint : Design Patterns - Iterator Pattern](https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm)
* [dzone : Iterator Design Pattern In Java](https://dzone.com/articles/iterator-design-pattern-in-java)
* [refactoring.guru : Design Patterns / Behavioral Patterns / Iterator](https://refactoring.guru/design-patterns/iterator)