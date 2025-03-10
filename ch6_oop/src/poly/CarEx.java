package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = new FireEngine();

        car.drive();
        car.stop();

        // 한줄로도 강제 형변환 가능
        ((FireEngine) car).water();
        // 위와 같은 개념
        FireEngine fe = (FireEngine) car;
        fe.water();

        // instance of : 참조 변수가 참조하고 있는 실제 인스턴스의 타입 알아보기

        if (car instanceof FireEngine) {
            System.out.println("FireEngine 의 intance 임");
        }
        if (car instanceof Car) {
            System.out.println("Car 의 intance 임 ");
        }

        Car car2 = new Car(); // 출력문이 없으면 (FireEngine)car2 강제 형변환 안됨
        if (car2 instanceof FireEngine) {
            System.out.println("car2 - FireEngine 의 intance 임");
        }
        if (car2 instanceof Car) {
            System.out.println("Car2 - car 의 intance 임 ");
        }

    }
}
