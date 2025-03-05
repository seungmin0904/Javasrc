package oop;

public class Account {
    // 속성 : 계좌번호(ano) , 계좌 주인 이름(owner), 잔액(balance)
    // 기능 : 예금+ , 출금-
    // 잔액 long

    // 생성자 default, 멤버변수 초기화

    String ano;
    String owner;
    long balance;

    public Account() {
    }

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;

    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

    // 기능 입금 출금
    void deposit(long amount) {
        this.balance += amount;

    }

    void withdraw(long amount) {
        this.balance -= amount;

    }

}
