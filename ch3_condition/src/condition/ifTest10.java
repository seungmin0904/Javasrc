package condition;

import java.util.Scanner;

public class ifTest10 {
    public static void main(String[] args) {
        // 세 개의 입력 받은 수 중 가장 큰수와 가장 작은 수를 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 수 입력");
        String input = scan.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두번째 수 입력");
        input = scan.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.println("세번째 수 입력");
        input = scan.nextLine();
        int num3 = Integer.parseInt(input);

        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }

        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.printf("가장 큰 수 %d, 가장 작은 수%d", max, min);

    }

}
