package extend;
// 클래스간의 관계

// 1. 상속관계 (is a)

// 2. 포함관계 (has a)
// 한 클래스 안에 다른 클래스가 멤버 변수로 선언

// 관계 결정하기
// public class Circle extends Point{}
// Car , SportsCar : public class SportsCar extends Car (isa)
// 원(Circle)은 점(Point) 이다 : Circle is a Point (isa)

// 포함 : 원(Circle)은 점(Point)을 가지고 있다 : Circle has a Point (hasa)

public class Circle extends Shape {
    // int x;
    // int y;
    Point point;
    int r;
    String name;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center = (%d , %d), r = %d, color = %s]\n",
                point.x, point.y, r, color);
    }
}
