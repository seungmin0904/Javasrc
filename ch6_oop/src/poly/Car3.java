package poly;

public class Car3 {
    // 멤버변수의 타입을 지정할 때 : 기본, 객체
    // 기본 : 정수 = 0, 실수 = 0.0, boolean = false..
    // 객체 : null(대문자로 시작, 배열)

    // 초기화 1) 생성자 사용 2) set 메서드 3) 멤버변수 선언과 동시에 초기화 (new)
    // 객체 초기화는 무조건 new ?

    // 3)
    Tire fronLeft = new HankookTire(5, "앞 왼쪽");
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    int num;

    // 1)
    public Car3(Tire fronLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.fronLeft = fronLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
