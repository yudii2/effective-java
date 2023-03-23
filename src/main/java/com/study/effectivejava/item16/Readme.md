# 아이템 16 : public 클래스에서는 public 필드가 아닌 접근자 메서드를 사용하라


인스턴스 필드만을 모아놓은 클래스는 데이터에 직접 접근할 수 있으나 캡슐화의 이점을 제공하지 못한다.

[Point.java](Point.java)
- API를 수정하지 않고는 내부 표현을 바꿀 수 없다.
  
    getter/setter 가 존재해야 내부 표현 변경 가능.
- 불변식을 보장하지 못한다.
    
    클라이언트가 데이터를 변경할 수 있다.
- 외부에서 필드에 접근할 때 부수작업을 수행할 수 없다.

## 객체지향적 클래스 작성
[PointPOJO.java](PointPOJO.java)

필드를 `private` 으로 바꾸고 `public` 접근자 (getter) 를 추가한다.

public 클래스에서는 패키지 외부에서도 접근할 수 있어야 하므로, 이 방법을 사용하자. 


## package-private 클래스 혹은 private 중첩 클래스 데이터 캡슐화
[VoiceCaddie.java](VoiceCaddie.java)

`package-private` 클래스 혹은 `private` 중첩 클래스라면 데이터 필드를 노출한다 해도 클래스가 표현하려는 추상 개념만 올바르게 표현해주면 문제가 없다.

