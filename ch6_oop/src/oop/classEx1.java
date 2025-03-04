package oop;

// oop(Objext Oriented Programming - 객체지향)
// 재사용성이 높다
// 코드의 관리가 쉽다
// 신뢰성이 높은 프로그램을 작성

// 클래스 : 객체 정의, 설계도, 틀
// 클래스 용도 : 객체 생성

// 객체 : 사물, 개념

// 붕어빵 기계(클래스) - 붕어빵(객체)

// 객체 >= 인스턴스
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// 책상은 책상 클래스의 인스턴스다

public class classEx1 {
    public static void main(String[] args) {
        // 인스턴스 생성
        // 클래스명 변수명 = new 클래스명();
        Tv tv = new Tv();
        Tv tv2 = new Tv();

        // 속성 확인
        System.out.println(tv); // oop.Tv@5ca881b5 => Tv [size=0, color=null, chan=0, vol=0, power=false]
        System.out.println(tv2); // oop.Tv@24d46ca6 => Tv [size=0, color=null, chan=0, vol=0, power=false]

        // 인스턴스 사용
        tv.color = "black";
        tv.chanUp();
        System.out.println("tv 현재 채널 :" + tv.chan);
        System.out.println("tv 현재 색상 :" + tv.color);

        // 메소드 : 호출 시 () 생성된 것
        tv2.power(); // 메소드 호출(메소드 실행)
        tv2.chan = 8;
        tv2.vol = 22;
        System.out.println("현재 채널 :" + tv2.chan);
        System.out.println("현재 tv 상태 :" + tv2.power);
        System.out.println("현재 tv 볼륨 :" + tv2.vol);

    }
}
