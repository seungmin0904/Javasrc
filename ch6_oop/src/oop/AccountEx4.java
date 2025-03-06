package oop;

import java.util.Scanner;

public class AccountEx4 {
    private static Account1 account[] = new Account1[100];
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
                    createAccount();
                    break;

                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
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

    private static void createAccount() {
        System.out.print("계좌 번호");
        String ano = sc.nextLine();

        System.out.print("계좌주");
        String owner = sc.nextLine();
        // 잔액
        System.out.print("금액");
        int balance = Integer.parseInt(sc.nextLine());

        // for : account[i] 첫번째 만나는 null이면
        for (int j = 0; j < account.length; j++) {
            if (account[j] == null) {
                account[j] = new Account1(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }

        // 찾으면 루프 종료
    }

    private static void accountList() {
        System.out.println("================================");
        System.out.println("계좌 목록");
        System.out.println("================================");

        // 배열 출력
        // System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(),
        // account.getBalance());

        // for (int j = 0; j < account.length; j++) {
        // if(account[j] != null){

        // System.out.printf("%s\t%s\t%d\n", account[j].getAno(), account[j].getOwner(),
        // account[j].getBalance());

        // }
        // }
        for (Account1 acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());

            }
        }

    }

    private static void deposit() {
        // 예금하다
        // 계좌번호 입력 받기 => 사용자가 입력한 계좌번호와 account의 계좌번호 일치 여부
        // 예금액 입력받기 => 잔액 + 예금액
        System.out.print("계좌 번호");
        String ano = sc.nextLine();

        // 예금액 입력받기
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account1 findAcc = findAccount(ano);
        // findAcc가 null 일때 메서드에 접근하면 NullpointerException 발생
        if (findAcc != null) {
            findAcc.deposit(balance);
        }

    }

    private static Account1 findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌중에서 일치하는 계좌 찾기
        // null이 아니어야 하고 account[i].getAno() == ano > break;
        // return account[i]

        for (int i = 0; i < account.length; i++) {
            if (account[i] != null) {
                if (account[i].getAno().equals(ano)) {
                    return account[i];

                }
            }
        }
        return null;

    }

    private static void withdraw() {
        System.out.print("계좌 번호");
        String ano = sc.nextLine();

        System.out.print("출금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account1 findAcc = findAccount(ano);
        if (findAcc != null) {
            findAcc.withdraw(balance);
        }

    }
}