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
            System.out.println("  1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료   ");

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
        System.out.print("계좌 번호 : ");
        String ano = sc.nextLine();

        // 중복된 계좌 번호가 있는지 확인
        if (findAccount(ano) != null) {
            System.out.println("이미 존재하는 계좌입니다.");
            return; // 중복 계좌가 있으면 계좌 생성하지 않음
        }

        System.out.print("계좌 주 성함 : ");
        String owner = sc.nextLine();

        // 잔액
        System.out.print("금액 (1000원 이상) : ");
        int balance = Integer.parseInt(sc.nextLine());

        // 입금액이 1000원 미만일 경우
        if (balance < 1000) {
            System.out.println("계좌 개설 시 1000원 이상 입금해야 합니다.");
            return; // 1000원 미만이면 계좌 생성하지 않음
        }

        // 계좌가 배열에 저장 될 수 있는지 확인 후 , 저장
        // => for : account[i] 첫번째 만나는 null이면
        for (int j = 0; j < account.length; j++) {
            if (account[j] == null) { // 빈 공간이 있을 경우(null)
                account[j] = new Account1(ano, owner, balance); // 계좌 생성 후 배열에 저장
                System.out.println("계좌가 생성되었습니다.");
                break; // 계좌 생성 후 루프 종료 > break가 없으면 무한대로 생성함
            }
        }

        // 찾으면 루프 종료
    }

    private static void accountList() {
        System.out.println("============================================");
        System.out.println("                  계좌 목록                  ");
        System.out.println("============================================");

        // 배열 출력
        // System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(),
        // account.getBalance());

        // for (int j = 0; j < account.length; j++) {
        // if(account[j] != null){

        // System.out.printf("%s\t%s\t%d\n", account[j].getAno(), account[j].getOwner(),
        // account[j].getBalance());

        // }
        // }
        boolean accountExists = false; // 계좌가 하나라도 있으면 true로 설정
        for (Account1 acc : account) {
            if (acc != null) { // 계좌가 존재하면
                System.out.printf("계좌번호 : %s\t 계좌주 성함 : %s\t 잔액 : %d\n", acc.getAno(), acc.getOwner(),
                        acc.getBalance());
                accountExists = true; // 계좌가 있으면 true로 설정
            }
        }
        if (!accountExists) { // 계좌가 없으면
            System.out.println("계좌가 존재하지 않습니다.");
        }

    }

    private static void deposit() {
        // 예금하다
        // 계좌번호 입력 받기 => 사용자가 입력한 계좌번호와 account의 계좌번호 일치 여부
        // 예금액 입력받기 => 잔액 + 예금액
        System.out.print("계좌 번호 : ");
        String ano = sc.nextLine();

        // 예금액 입력받기
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        // 예금액이 0원 이상인지 확인
        if (balance <= 0) {
            System.out.println("예금액은 0원 이상 금액이어야 합니다.");
            return; // 예금액이 0원 이하일 경우 예금 진행하지 않음
        }
        Account1 findAcc = findAccount(ano); // 계좌 찾기
        // findAcc가 null 일때 메서드에 접근하면 NullpointerException 발생
        if (findAcc != null) { // 계좌가 존재하면
            findAcc.deposit(balance); // 예금 처리
            System.out.println("예금 완료. 현재 잔액 :" + findAcc.getBalance());
        } else { // 계좌가 없으면
            System.out.println("계좌번호가 일치하지 않습니다.");
            return;
        }
    }

    private static Account1 findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌중에서 일치하는 계좌 찾기
        // null이 아니어야 하고 account[i].getAno() == ano > break;
        // return account[i]

        for (int i = 0; i < account.length; i++) {
            if (account[i] != null) {
                if (account[i].getAno().equals(ano)) {
                    return account[i]; // 계좌번호가 일치하면 해당 계좌 반환

                }
            }
        }
        return null; // 일치하는 계좌가 없으면 null 반환

    }

    private static void withdraw() {
        System.out.print("계좌 번호 : ");
        String ano = sc.nextLine();

        System.out.print("출금액 : ");
        int balance = Integer.parseInt(sc.nextLine());
        Account1 findAcc = findAccount(ano); // 계좌 찾기

        if (findAcc != null) { // 계좌가 존재하면
            if (findAcc.getBalance() >= balance) { // 잔액이 충분한지 확인
                findAcc.withdraw(balance); // 출금 처리
                System.out.println("출금 완료. 현재 잔액 : " + findAcc.getBalance());
            } else { // 잔액이 부족하면
                System.out.println("잔액이 부족합니다. 현재 잔액 :" + findAcc.getBalance());
            }
        } else { // 계좌가 없으면
            System.out.println("계좌번호가 일치하지 않습니다.");
        }

    }
}