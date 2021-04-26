# State 패턴(김동석)

## 패턴 다이어그램

![State](https://refactoring.guru/images/patterns/content/state/state-en-2x.png?id=dfd427a938223ae88029 "State")

"어떤 객체의 상태에 따라 행위가 변경되는 경우 유용한 패턴"
(출처:https://refactoring.guru/design-patterns/state)

## 해결하려는 문제

1. context의 상태에 따른 처리가 구분되는 경우 해당 구분로직을 context에 하드 코딩하게 되면 경우 확장성이 떨어진다.

## 특징/용도
1. 상태를 클래스화 하고 해당 동작들을 넣는다
1. 원래의 객체(context)는 현재 상태 객체의 참조를 가진다
1. context는 2개 이상의 상태를 동시에 가질 수는 없다

## 고려사항

1. State 패턴은 Strategy 패턴과 유사하다. 주요한 차이점은 상태객체들은 서로의 존재를 아는 반면 Strategy패턴에서는 Strategy간의 관련성은 없다는 것이다(https://refactoring.guru/design-patterns/state)

## 클래스 다이어그램

![State 패턴(김동석)](https://www.plantuml.com/plantuml/png/dLEzJiCm49xnKrYLK9EXoLuGwb293XGgu0MS-9gOnabbNu8gG0Af6qY84GawCuB4mYkLz1rm4re8b85wEj_TztDdkQMHAKnbH8-G8T3PpTDi_6fDtoxVR-_pyQDDI2WuK9137549qWEbgoaC4wu9GO4H_CaI0kEWQ8Wur4tN3GI6gUVuYNIzA0Mk1qAw9onZRT0YY7iC4LIiIJz9J43poLq-Vicl7wRFLtIJ6mchDZB7wNOTpkkqtkaqfQmPiqJ41j1dFj0UymSiWDBH6TaOfbuaVEDGYJYW0U1-Wg8_seMvrfxGQDdaWX0_ObhJ0yKLyFMmROW4PB0s_X1y4DcwwC-n2vmIsPoYiWa_LGfYB2vRI-ui4PngADDM1H33QH7Oo-PAELY0x7yQBL37e75kjTHVPCgsYipskUDyVvKLrHzxNz5HsImXNmuQZPt5LAkp5SRV1TA2c9jVz040 "State 패턴(김동석)")

## 소스
1. Context : 상태를 가지고있는 객체(Package.java)
1. State : Context의 상태(OrderedState.java, DelieveredState.java, ReceivedState.java)

## 참고

* [wikipedia : State pattern](https://en.wikipedia.org/wiki/State_pattern)
* [refactoring.guru : Design Patterns / Behavioral Patterns / State](https://refactoring.guru/design-patterns/state)
* [tutorialspoint : Design Patterns - State Pattern](https://www.tutorialspoint.com/design_pattern/state_pattern.htm)