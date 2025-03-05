package oop;
// 메서드 종류

// 1. 인스턴스 메서드 : 클래스 영역 / 인스턴스가 생성 되었을때 (new card())
// 2. 클래스 메서드 : 클래스 영역 / 클래스가 메모리에 올라갔을때 (클래스작성 완료 되면)

// 같은 클래스 내에서 다른 메서드를 호출 가능
// 같은 클래스 내에서 이름만 이용해서 호출 가능 new(X)
// static - non-static : 생성되는 시기가 다르기 때문에 호출 시점을 따져야 함 

//non - static : static, non-static 사용가능
public class MiniCalc {

    static int k;
    int a, b;

    // 클래스 메서드
    static void print() {
        // plus() , avg(), execute(), 호출불가 => new MiniCalc() 한 후 호출 가능
        // this.a = 7; 호출 => new MiniCalc() 한 후
        k = 45; // static 호출 가능

    }

    int plus(int x, int y) {
        this.a = 7;
        k = 45;
        print();
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행 결과 : " + result);

    }

    void println(String msg) {
        System.out.println(msg);
    }
}
