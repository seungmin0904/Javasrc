package extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        }catch (Exception e){
            e.printStackTrace();
        }

        // CheckingAccount 의 생성자 호출
        // 부모의 인스턴스도 같이 생성됨

        // 계좌와 체크카드 생성 및 사용 금액을 지불 후 잔액 확인 
        CheckingAccount cAccount = new CheckingAccount("110-11", "kang", 1000, "123123");

        System.out.println("계좌번호 : " + cAccount.getAno());
        System.out.println("계좌주 : " + cAccount.getOwner());
        System.out.println("잔액 : " + cAccount.getBalance());
        System.out.println("체크카드번호 : " + cAccount.getCardNo());

        try {
            System.out.println("현재 잔액 : " + cAccount.pay("123123", 100));
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println();

        // 마이너스 한도를 가진 신용카드 계좌 생성 
        CreditLineAccount creditLineAccount = new CreditLineAccount("110-11", "kang", 100, 3000000);
        try {
            // creditLineAccount.withdraw((3500000));
            creditLineAccount.withdraw(2500000);
            System.out.println(creditLineAccount.getLastwithdrawnAmount() + "원 결제 완료 ");
            System.out.println("현재 잔액 : " + creditLineAccount.getBalance());

        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println();
        // 보너스 적립 기능을 가진 계좌 생성
        BonusPointAccount bonusPointAccount = new BonusPointAccount("110-11", "kang", 100000, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("보너스포인트 : " + bonusPointAccount.getBonusPoint());
        System.out.println();
        
        
        // 교통카드 기능을 가진 체크카드 및 계좌 생성
        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("110-11", "kang", 100000, "123123",
                true);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("110-11", "kang", 100000, "123123",
                false);
        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + checkingTrafficAccount.payTrafficCard("123123", 1750));
            System.out.println("현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("123123", 1750));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
