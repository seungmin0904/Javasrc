package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {
    // 속성 : 계좌번호(ano) , 계좌 주인 이름(owner), 잔액(balance)
    // 기능 : 예금+ , 출금-
    // 잔액 long

    // 생성자 default, 멤버변수 초기화

    String ano;
    String owner;
    long balance;

    // public Account() {
    // }

    // public Account(String ano, String owner, int balance) {
    //     this.ano = ano;
    //     this.owner = owner;
    //     this.balance = balance;

    // }

//     @Override
//     public String toString() {
//         return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
//     }

//     // 기능 입금 출금
//     public long getBalance() {
//         return balance;
//     }

    void deposit(long amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " 원 입금됨 " + "현재 잔액" + balance + "원");

        } else {
            System.out.println("입금 불가! 입금액이 유효하지 않습니다.");

        }
    }

    void withdraw(long amount) {

        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원 출금됨. 현재 잔액:" + balance + "원");

        } else {
            System.out.println("출금 불가! 잔액 부족 또는 유효하지 않은 금액입니다.");
            System.out.println("현재 잔액: " + balance + "원, 출금 시도 액: " + amount + "원");
        }
    }
 }
