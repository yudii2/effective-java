# 아이템 13: clone 재정의는 주의해서 진행하라

## Cloneable 인터페이스
Object 의 protected 메소드인 `clone()`의 동작 방식을 결정한다.

실무에서 Cloneable을 구현한 클래스는 `clone()`메소드를 public으로 제공하며, 사용자는 당연히 복제가 제대로 이뤄지리라 기대한다.


## covariant return typing 공변 반환 타이핑
재정의`(override)`한 메서드의 `반환 type`은 상위 클래스의 메서드가 반환하는 타입의 **하위 타입**일 수 있다.

```java
@Override
public PhoneNumberClone clone() {
    try {
        return (PhoneNumberClone) super.clone();    // Object의 하위 타입 PhoneNumberClone
    } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
    }
}
```