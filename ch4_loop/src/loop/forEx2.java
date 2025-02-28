package loop;
// 반복문 - for ,while , do~while

// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력 (1)
// 1) int i = 0; (초기화:한번만 실행)
// 2) i < 5; // 조건 (2)
// 3) loop 안으로 진입 - 안녕하세요 출력
// 4) 증감 연산자 실행 ( i++ ) i = 0 >> i = 1 // (3)
// 5) 조건검사
// 6) loop 진입 - 안녕하세요 출력 
// 7) 증감 연산자 실행 ( i++ ) i = 1 >> i = 2
// 8) int i = 5; 조건을 만족하면 loop 중단 5 < 5 

// 반복문 중단 : 강제 break , or 조건이 false

public class forEx2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");

        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");

        }
        // 짝수만 출력
        System.out.println();
        for (int i = 1; i < 11; i++) {
            // i가 짝수이면 출력
            if (i % 2 == 0)
                System.out.print(i + "   ");

        }
        System.out.println();

        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "   ");

            // int i = 0;
            // for (int j = 0, k=1; i < args.length; i++){

            // }
            // for (; ; ){
            // break;
            // }

        }

    }

}
