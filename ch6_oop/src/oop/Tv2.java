package oop;
// Tv 클래스를 통해서 Tv(객체,인스턴스)를 생성한다

// 객체 구성요소
// 1. 속성(특성) => 멤버 변수
// 2. 기능(동작) => 멤버 메소드

public class Tv2 { // 클래스 내에 선언된 것은 멤버변수
    // private : 외부 클래스에서 접근 불가
    private int size;
    private String color;
    private int channel;
    private int vol;
    private boolean power;

    // 초기화 - 생성자
    public Tv2() {

    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void changeChannel(int channel) {
        this.channel = channel;
    }

    // 채널변경, 음량 변경, 전원 온오프 , 동작 메소드는 중괄호 안 동작을 실행해줌
    void chanUp() {
        channel++;
    }

    void chanDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", chan=" + channel + ", vol=" + vol + ", power=" + power
                + "]";
    }

}
