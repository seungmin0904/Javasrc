package loop;
// 반복문 - for ,while , do~while

// 반복적으로 실행해야 하는 코드를 간단하게 처리

public class forEx3 {
    public static void main(String[] args) {

        int sum = 0;

        // 1~10까지의 합
        for (int i = 1; i < 11; i++) {
            sum += i;

        }
        System.out.printf("1~10까지의 합" + "  " + sum);

        // 1~100까지의 수 중에서 3의 배수만 출력

        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0) {
                System.out.print(i + "\t");
            }

        }

    }

}
