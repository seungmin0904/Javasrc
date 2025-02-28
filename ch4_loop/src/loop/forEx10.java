package loop;

import java.util.Scanner;

public class forEx10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int num = scan.nextInt();

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }
                System.out.print(j > i ? " " : "*");
            }
            System.out.println();
        }

    }

}
