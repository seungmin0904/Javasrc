package extend;
// 상속 관계는 

// 1. has a 부모와 자식 관계를 제외한 관계는 has a
// 2. is a (단일 상속)

// ( is a ) =
// 기존의 클래스를 재 사용하여 새로운 클래스 작성
// 장점
// 적은 양의 코드로 새로운 클래스 작성 가능
// 코드를 공통적으로 관리가능 => 코드의 추가 및 변경 용이 
// class Child extends Parent, Tv (x)

// Object 클래스 : 모든 클래스의 조상
// 자동적으로 무조건 Object 클래스를 상속받음

// 조상 클래스 : 부모 , super , 상위, 기반(base) 클래스
// 자손 클래스 : 자식, sub, 하위, 파생클래스
public class Parent {
    int age;
}
