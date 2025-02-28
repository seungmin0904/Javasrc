package loop;

import java.util.Scanner;

public class breakEx3 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int b = 0; // 잔액 초기화x 반복문 밖에

        while (run) {
            System.out.println("==================================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("==================================");

            System.out.print("메뉴 번호 입력 >> ");
            int menu = sc.nextInt();

            int a = 0; // 예금액, 출금액

            // b += sc.nextInt();

            switch (menu) {
                case 1:
                    // 예금액 입력
                    System.out.print("예금액 >> ");
                    a = sc.nextInt();
                    // 잔액 = 잔액+예금액
                    b += a;
                    break;
                case 2:
                    // 출금액 입력
                    System.out.print("출금액 >> ");
                    a = sc.nextInt();
                    // 잔액 = 잔액 - 출금액
                    b -= a;
                    break;
                case 3:
                    // 잔액 출력
                    System.out.println("잔액" + b);

                    break;
                case 4:
                    run = false; // 반복문 종료 (while)
                    break;

                default:
                    break;
            }

        }

    }

}
