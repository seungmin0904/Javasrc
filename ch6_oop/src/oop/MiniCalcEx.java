package oop;

public class MiniCalcEx {
    public static void main(String[] args) {
        // print() 메소드 호출
        // 클래스 메서드(or 변수) 이기 때문에 객체 생성 없이 클래스이름. 으로 호출 가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // excute() 호출
        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 7;
    }
}
