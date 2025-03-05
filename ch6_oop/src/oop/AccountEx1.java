package oop;

public class AccountEx1 {
    public static void main(String[] args) {
        Account account = new Account();

        account.ano = "110-10-0100";
        account.owner = "홍길동";
        account.balance = 1000000;

        // 200,000 입금
        account.deposit(200000);
        System.out.println("현재 잔액: " + account.balance);

        // 150.000 출금
        account.withdraw(150000);
        System.out.println("현재 잔액: " + account.balance);

    }
}
