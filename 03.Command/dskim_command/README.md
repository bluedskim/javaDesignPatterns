# Command 패턴(김동석)

![Command Pattern : Real-World Analogy](https://refactoring.guru/images/patterns/content/command/command-comic-1-2x.png?id=47b3c00b2cfbda7157a1 "Command Pattern : Real-World Analogy")
(출처:https://refactoring.guru/design-patterns/command)

## 해결하려는 문제
1. view(presentation)과 비즈니스 로직의 직접 연관을 제거(행위가 소스에 하드코딩되어 있다면 런타임에 추가/변경이 불가능)

## 용도/목적
1. 조건문이 많은 복잡한 로직을 간단하게
1. invoker와 receiver 사이에 command를 두어 직접 연관을 제거하여 새로운 command가 추가되더라도 invoker를 수정할 필요가 없음

## 특징
1. 행위behavioral 패턴
1. 눈에 보이지 않는 무형의 개념(행위)도 객체화 할 수 있다.

## 고려사항
1. command용 interface(TextFileOperation.java)는 @FunctionalInterface로 할 수 있다.

## 클래스 다이어그램

![Command Method 패턴(김동석)](https://www.plantuml.com/plantuml/png/bLFFIyCm63sRlo8CPErXxNs83Fp1BaDXWkUq-RP6cwGqNyU62WgxAOX7GJrxLF3YlpIx_y4uPzri7PfJykMzxxsyZxGCiXGp6TCjBILJd7O08ytfzEfnEdvn9g_dRzUt-VZU9IGI72Z814TKWWmWDSkb3vuX10N6KBGhzuc0SKXfX9YOfk_t1KPPu8LQ-a6S0JV7Glf7RC2smOY-scU8a2f3UbhR3SqVRlBnStvvDtcweEkS8JYraLrUf-DnNgVrThifPStQ3MDc33s08UuAQ-Y4h7Kn5QfFTGBASOkZOGEmnpD2XB8AFHP2mTfB86Kej5gWmn323EUKJn4BKvMK90jY4LRVEuKrd6_SLHfTQtELHkNzFpLA_9qPHgU7TaXV4oqbKLRxzeS_ApErCcxZrFEgO_eDNFbUGgf7qMXi5eyZrKakGSYVabYaB5XeWUBsHxq3 "Command Method 패턴(김동석)")

## 소스
1. client : command를 초기화하고 invoker를 호출
    * TextFileOperationExecutorWithoutCommandTest.java : command를 사용하지 않은 샘플 테스트용
    * TextFileOperationExecutorWithCommandTest.java : command를 사용한 샘플 테스트용
1. invoker : command를 받아 interface에 정의된 메소드를 호출하고 필요 시 이력 저장용 list에 저장
    * TextFileOperationExecutorWithCommand.java
1. receiver : 실제 로직이 정의된 클래스
    * TextFile.java
1. command : command 객체
    * TextFileOperation.java : command용 interface
    * OpenTextFileOperation.java : 파일 open하기 command
    * SaveTextFileOperation.java : 파일 save하기 command

## 참고

* [wikipedia : Command pattern](https://en.wikipedia.org/wiki/Command_pattern)
* [baeldung : The Command Pattern in Java](https://www.baeldung.com/java-command-pattern)
* [Alvin Alexander : A Java Command Design Pattern example](https://alvinalexander.com/java/java-command-design-pattern-in-java-examples/)
  + [A Java Action, ActionListener, and AbstractAction example](https://alvinalexander.com/java/java-action-abstractaction-actionlistener)