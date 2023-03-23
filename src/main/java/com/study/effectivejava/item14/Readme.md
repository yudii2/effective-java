# 아이템 14: Comparable을 구현할지 고려하라

알파벳, 숫자, 연대 등 순서가 명확한 값 클래스를 작성한다면 반드시 Comparable 인터페이스를 구현하자.

## compareTo
- 동치성 비교
- 순서 비교
- 제네릭

## comparaTo 규약
읿반적으로 equals 규약과 비슷하다.

```
1. 두 객체 참조의 순서를 바꿔 비교해도 예상한 결과가 나와야 한다.
2. 추이성을 충족해야 한다. a > b 이고, b > c 이면, a > c 이다.
3. 크기가 같은 객체들끼리는 항상 같아야 한다.
```
equals와 달리 compareTo는 타입이 다르면 간단히 ClassCastException을 던진다.

## 비교자 생성 방식
1. 정적 compare 메서드
   
    primitive 타입 클래스는 compare 메서드를 제공한다. `ex) Integer.compare(a, b)`
2. 비교자 생성 메서드

   Comparator 인터페이스는 비교자 생성 메서드를 제공한다. `ex) Comparator.comparingInt()`