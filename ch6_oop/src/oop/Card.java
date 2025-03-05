package oop;

// 변수 종류 
// 1. 지역변수 : 메서드, 생성자, 초기화블럭 내부 등에서 선언 / 변수 선언문이 실행 될때 
// 2. 인스턴스 변수 : 클래스 영역 / 인스턴스가 생성 되었을때 (new card())
// 3. 클래스 변수 : 클래스 영역 / 클래스가 메모리에 올라갔을때 (클래스 작성 완료 되었을때)
public class Card {
    // 멤버 변수(인스턴스 변수)
    String kind;
    int number;
    // 클래스 변수(공통속성)
    static int width = 100;
    static int height = 250;
}
