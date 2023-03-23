# 아이템 11: toString을 항상 재정의하라

## toString 규약
모든 하위 클래스에서 이 메서드를 재정의하라. 

재정의하지 않으면, `클래스명@16진수로 표시한 해시코드` 를 반환한다.


## 정적 유틸리티 클래스, 열거 타입
정적 유틸리티 클래스는 toString 을 제공할 이유가 없다.

열거타입은 자바에서 완벽한 toString을 제공하고 있다.

```
# java.lang.enum.toString()

Returns:
the name of this enum constant
```
