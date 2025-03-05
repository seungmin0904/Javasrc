package oop;

// static이 붙은 메서드 : 클래스 메서드
public class PrimitiveParamEx {
    public static void main(String[] args) {
        // main 메서드
        Data d = new Data();
        d.x = 100;
        System.out.println("main(): x =" + d.x);
        //change(d.x);
        change2(d);
        System.out.println("After change()");
        System.out.println(d.x);
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();

    }

    // static void change(int x) {
    //     x = 10000;

    //     System.out.println("change() : x = " + x);

        static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);

        
        // change(d.x) (기본형) 값 복사 변경되지 않음 100
        // change2(d) (참조형) 참조값 전달 변경됨 10000
        // 기본형(int, double, boolean 등): 값만 전달 → 메서드 내부 변경은 원본에 영향 없음.
        // 참조형(객체, 배열 등): 주소값이 전달 → 메서드 내부 변경이 원본에 영향 줌.

    }
}
