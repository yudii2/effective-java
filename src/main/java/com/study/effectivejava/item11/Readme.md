# 아이템 11: equals를 재정의하려거든 hashCode도 재정의하라

## Object 규약
1. equals 비교에 사용되는 정보가 변경되지 않았다면, 애플리케이션이 실행되는 동안 객체의 hashCode는 항상 같은 값을 반환해야 한다.
2. **equals(Object) 에 의해 두 객체가 같다면, 두 객체의 hashCode는 같은 값을 반환해야 한다.**
3. equals(Object) 에 의해 두 객체가 다르더라도, 두 객체의 hashCode가 다른 값을 반환할 필요는 없다. 다만, 다른 값을 반환해야 해시테이블의 성능이 좋아진다.

## hashCode 작성 요령
1. int 변수 result 를 선언한 후 값 c로 초기화한다. (c - 첫번째 핵심 필드의 해시코드)
2. 해당 객체의 나머지 핵심 필드에 대해 계산한다.
   + 해당 필드의 해시코드 c를 계산한다.
     + primitive 타입이면, [박싱Type.hashCode(f)]() 를 수행한다.
     + reference 타입이면, hashCode를 재귀적으로 호출한다. 필드 값이 null이면 0을 사용한다.
     + 배열이라면, 원소 각각을 별도의 필드처럼 다룬다. 배열에 핵심 원소가 없다면 단순히 상수(0 추천)를 사용한다. 모든 원소가 핵심 원소라면 [Arrays.hashCode]()를 사용한다.
   + 해시코드 c로 result를 갱신한다.
     + `result = 31 * result + c;`
3. result를 반환한다.
    

## Objects.hash() 
1. 입력 인수를 담기 위한 배열이 생성된다.
2. 입력 인수 중 primitive 타입이 있다면 박싱-언박싱 과정이 필요하다.
3. `Objects.hash()` 메소드는 성능에 민감하지 않을 때만 사용하자. 
