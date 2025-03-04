package oop;
// Tv 클래스를 통해서 Tv(객체,인스턴스)를 생성한다

// 객체 구성요소
// 1. 속성(특성) => 멤버 변수
// 2. 기능(동작) => 멤버 메소드

public class Tv { // 클래스 내에 선언된 것은 멤버변수
    // 크기(int) , 색상(String) , 채널(int) , 볼륨(int)
    int size;
    String color;
    int chan;
    int vol;
    boolean power;

    // 채널변경, 음량 변경, 전원 온오프 , 동작 메소드는 중괄호 안 동작을 실행해줌
    void chanUp() {
        chan++;
    }

    void chanDown() {
        chan--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", chan=" + chan + ", vol=" + vol + ", power=" + power + "]";
    }

}
