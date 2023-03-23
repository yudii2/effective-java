# 아이템 10: equals는 일반 규약을 지켜 재정의하라

## equals 메소드 재정의 해야할 때

물리적 동치 (객체 식별성 - object identity) \
**논리적 동치 (logical equality) 관계를 확인해야 하는데, 논리적 동치성을 비교하도록 재정의되지 않았을 때** \
예시) Integer, String ,, 값 클래스

[아이템1](../item01/Readme.md)과 같이 정적 팩터리 메소드에 의해 구현된 하나의 인스턴스를 공유하는 객체는 equals 재정의가 불필요하다. 
2개 이상의 인스턴스가 만들어지지 않으므로 물리적, 논리적으로 같다고 볼 수 있다.
```
*** 논리적 동치 (logical equality)
 'p와 q의 진리값이 서로 같다. p=q라고 표현하기도 하며, p와 q는 같다. 또는 p와 q의 진리값은 같다. 라고 읽는다.' 
```

## equals 메서드 재정의 일반 규약
equals 메서드는 동치관계(equivalence relation)를 구현하며, 다음을 만족한다.
```
- 반사성(reflexivity) : null이 아닌 모든 참조 값 x에 대해, x.equals(x)는 true 다.
- 대칭성(symmetry) : null이 아닌 모든 참조 값 x,y에 대해, x.equals(y)가 true면 y.equals(x)도 true다.
- 추이성(transitivity) : null이 아닌 모든 참조 값 x,y,z에 대해, x.equals(y)가 true이고 y.equals(z)도 true면 x.equals(z)도 true다.
- 일관성(consistency) : null이 아닌 모든 참조 값 x,y에 대해, x.equals(y)를 반복해서 호출하면 항상 true를 반환하거나 항상 false를 반환한다.
- null-아님 : null이 아닌 모든 참조 값 x에 대해, x.equals(null)은 false다.
```

## equals 메소드 구현 방법
1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
2. instanceof 연산자로 입력이 올바른 타입인지 확인한다.
3. 입력을 올바른 타입으로 형변환한다.
4. 입력 객체와 자기 자신의 대응되는 '핵심'필드들이 모두 일치하는지 하나씩 검사한다.

