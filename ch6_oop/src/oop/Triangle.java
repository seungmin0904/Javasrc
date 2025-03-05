package oop;

public class Triangle {
    // 속성 : 밑변(baseLine) , 높이(height)

    int baseLine;
    int height;

    public Triangle() {
    }

    // 생성자의 목적
    // 인스턴스 변수 초기화 => 안하면 main에서 직접 변수를 초기화 해야함
    public Triangle(int baseLine, int height) {

        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능 : 면적을 구한다. getArea()
    double getArea() {
        return baseLine * height / 2.0;
    }

}
