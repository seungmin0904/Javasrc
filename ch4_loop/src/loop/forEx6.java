package loop;

import java.util.Scanner;

// 팩토리얼 구하기
// 입력받은 숫자의 팩토리얼 구하기
// 4 : 4 * 3 * 2 * 1

public class forEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 입력");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            // fact = fact * i;
            fact *= i;

        }
        System.out.println(num + " != " + fact);

    }
}