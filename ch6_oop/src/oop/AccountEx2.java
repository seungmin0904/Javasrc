package oop;

import java.util.Scanner;

public class AccountEx2 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);  // 사용자 입력을 위한 Scanner 객체 생성

        // 사용자로부터 계좌 정보 입력받기
        System.out.print("계좌번호를 입력하세요: ");
        String ano = scanner.nextLine();

        System.out.print("예금주 이름을 입력하세요: ");
        String owner = scanner.nextLine();

        // System.out.print("초기 입금액을 입력하세요: ");
        //long balance = scanner.nextLong();
        long balance = 0; // 초기 입금액 0으로 설정 (입금 없이 계좌 생성 가능)

        // Account 객체 생성
        Account myAccount = new Account(ano, owner, (int) balance);
        System.out.println("\n" + myAccount.toString());  // 계좌 정보 출력

        while (true) {  // 무한 루프 (사용자가 종료할 때까지 반복)
            System.out.println("\n1. 입금  2. 출금  3. 잔액 조회  4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();  // 메뉴 선택

            if (choice == 1) {
                // 입금
                System.out.print("입금할 금액을 입력하세요: ");
                long depositAmount = scanner.nextLong();
                myAccount.deposit(depositAmount);

            } else if (choice == 2) {
                // 출금
                System.out.print("출금할 금액을 입력하세요: ");
                long withdrawAmount = scanner.nextLong();
                myAccount.withdraw(withdrawAmount);

            } else if (choice == 3) {
                // 잔액 조회
                System.out.println("현재 잔액: " + myAccount.getBalance() + "원");

            } else if (choice == 4) {
                // 종료
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }

        scanner.close();  // Scanner 객체 닫기
    }
}
