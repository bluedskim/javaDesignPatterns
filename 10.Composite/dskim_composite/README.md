# Composite 패턴(김동석)

## 패턴 다이어그램

![n order might comprise various products, packaged in boxes, which are packaged in bigger boxes and so on. The whole structure looks like an upside down tree.](https://refactoring.guru/images/patterns/diagrams/composite/problem-en-2x.png?id=5c7d443ccce3e46c4308 "n order might comprise various products, packaged in boxes, which are packaged in bigger boxes and so on. The whole structure looks like an upside down tree.")

"하나의 주문은 여러 상품으로 구성될 수 있다. 이 상품들은 여러 개의 다른 박스에 담길 수 있으며 이 박스들 역시 더 큰 박스에 담길 수 있다. 이런 구조는 뒤집힌 트리형태와 같다."
(출처:https://refactoring.guru/design-patterns/composite)

## 해결하려는 문제
1. 클라이언트는 트리tree구조의 자료구조에 접근할 때 부모 노드와 leaf노드를 접근하는 api가 틀리다면 소스가 복잡해진다. 부모와 노드를 일관된 방법으로 접근할 수 있다면 클라이언트 구현,변경,테스트,재사용이 쉬워진다.

## 특징/용도
1. 트리tree구조의 자료구조에만 적용가능하다.
1. Composite 객체는 요청을 자식객체들에게 순차적으로 전달forward한다.
## 클래스 다이어그램

![Iterator 패턴(김동석)](https://www.plantuml.com/plantuml/png/ZL9DIyCm63wRNn46ikxGzZw7JFGmmSbG_q3Ql6kZJLEIjuEXWi9k2k9HKCyU5RpubsRt7qox3LQ_M0uXUV8yx_D-f6kGQSnbGlSHD4EbwUpsPJPvTwOVLvzt3yNagKL8B3XGa1cEgGGPW3Pr26F53I4eC06wgsIcZ43u9L8CZ8EcCM9cshuV2Oppm0kLz8Ca1sxEXFHFsOZjWH5HEc1eaqeD6Ifb3xHulYycRyNDu_JrccvoXk0qndPv_Rx7UPCsUxssb0sRC16f5GnP2BGFQKxFoKQM1ua8gNsW4U10Yn2SrXQvNENkH966oCRz9XefmIdZl8ITwatQRQuE4sOCFLIAszh_zPapZoom3kyOS9d5WJ3OAI_RbQ_vKxn-lijfdu31qg9IX8l92PMMkDCg-PMyS-6wzUuiSSzRrBu2b2MIUYyhV54I8JLtrzskXlGJhHkIBgJS_jGl "Iterator 패턴(김동석)")

## 소스
1. Component : 공통 인터페이스로 leaf와 composition이 구현해야 할 메소드가 선언되어 있음
(Menu.java, AggregateMenu.java)
1. Leaf : 트리의 기본 요소로 하위 요소를 가지고 있지 않는다.
(Noodle.java, Rice.java)
1. Composite : Component를 구현implement. leaf의 container역할
(SetMenu.java)

## 참고

* [wikipedia : Composite pattern](https://en.wikipedia.org/wiki/Composite_pattern)
* [refactoring.guru : Design Patterns / Structural Patterns / Composite](https://refactoring.guru/design-patterns/composite)