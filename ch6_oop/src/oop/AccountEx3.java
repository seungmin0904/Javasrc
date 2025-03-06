package oop;

import java.util.Scanner;

public class AccountEx3 {
    private static Account1 account;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // account = createAccount 를 사용하려면
        // AccountEx3 obj = new AccountEx3();

        boolean run = true;
        while (run) {
            System.out.println("===========================================================");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료 ");

            System.out.println("===========================================================");

            System.out.print("선택>> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    account = createAccount();
                    break;

                case 2:
                    accountList(account);
                    break;

                case 3:
                    deposit(account);
                    break;

                case 4:
                    withdraw(account);
                    break;

                case 5:
                    run = false;

                    break;

                default:
                    System.out.println("번호 확인");
                    break;
            }

        }
    }

    private static Account1 createAccount() {
        System.out.print("계좌 번호");
        String ano = sc.nextLine();

        System.out.print("계좌주");
        String owner = sc.nextLine();

        System.out.print("금액");
        int balance = Integer.parseInt(sc.nextLine());

        return new Account1(ano, owner, balance);
    }

    private static void accountList(Account1 account) {
        System.out.println("================================");
        System.out.println("계좌 목록");
        System.out.println("================================");

        System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());

    }

    private static void deposit(Account1 account) {
        // 예금하다
        // 계좌번호 입력 받기 => 사용자가 입력한 계좌번호와 account의 계좌번호 일치 여부
        // 예금액 입력받기 => 잔액 + 예금액
        System.out.print("계좌 번호");
        String ano = sc.nextLine();
        if (ano.equals(account.getAno()))
            return;

        //
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        account.deposit(balance);
        // account.balance = account.getBalance() + balance;

    }

    private static void withdraw(Account1 account) {
        System.out.print("계좌 번호");
        String ano = sc.nextLine();
        if (ano.equals(account.getAno()))
            return;

        //
        System.out.print("출금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        account.withdraw(balance);
    }

    private static void run() {

    }
}
