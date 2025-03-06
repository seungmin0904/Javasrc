package oop;
// Tv 클래스를 통해서 Tv(객체,인스턴스)를 생성한다

// 객체 구성요소
// 1. 속성(특성) => 멤버 변수
// 2. 기능(동작) => 멤버 메소드

public class Tv3 { // 클래스 내에 선언된 것은 멤버변수

    // private : 외부 클래스에서 접근 불가 : 멤버 변수
    // public : 오픈형 외부 클래스 접근 가능 : 생성자,메서드

    private int size;
    private String color;
    private int channel;
    private int vol;
    private boolean power;

    // 초기화 - 생성자
    public Tv3() {

    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter : 인스턴스 변수 값 변경(설정)
    // getter : 인스턴스 변수 값 사용

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // 채널변경, 음량 변경, 전원 온오프 , 동작 메소드는 중괄호 안 동작을 실행해줌
    void chanUp() {
        channel++;
    }

    void chanDown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", chan=" + channel + ", vol=" + vol + ", power=" + power
                + "]";
    }

}
