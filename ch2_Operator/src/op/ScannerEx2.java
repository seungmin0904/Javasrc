package op;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in (키보드)
        // System.Out(화면)

        Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 코드

        // 입력값은 숫자
        System.out.print("숫자입력 >> ");

        int input = scanner.nextInt();

        System.out.println(input);

        scanner.close();

    }

}
