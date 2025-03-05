package oop;

// 메소드 : 리턴 타입, 메소드명 (){}
// 리턴(반환) 타입: 기본타입(int , String , boolean , double), 객체(대문자로 시작), 배열, void(리턴타입 없음)

public class Method {

    int method1() {
        int sum = 15;

        // return 0;
        return sum;
    }

    String method2() {
        String sum2 = "Hello";
        // return "1";
        // return null;
        return sum2;
    }

    Double method3() {
        return 1.0;
    }

    char method4() {
        return ' ';
    }

    boolean method5() {
        return true;
    }

    void method6() {
        return;
    }

    // 매개 변수가 있는 메서드
    // 매개변수는 void 제외 다 사용 가능
    // 개수 상관없음
    int add(int x, int y) {// 입력 x,y를 받아서 x + y 의 값을 내보낸다
        return x + y;
    }

    float add2(int x, float y) {
        // float + int = float
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + ": " + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }
}
