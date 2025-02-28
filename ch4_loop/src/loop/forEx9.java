package loop;

import java.util.Scanner;

public class forEx9 {
    public static void main(String[] args) {

        // *을 출력할 라인의값을 입력받기
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int num = scan.nextInt();
        // int num = Integer.parseInt(input);

        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        scan.close();
    }

}
