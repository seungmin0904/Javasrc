package extend;

public class CreditLineAccount extends Account {
    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String ano, String owner, int balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;

    }

    // 오버라이딩
    // 잔액 + 마이너스 한도 = 사용액
    // @Override
    // void withdraw(long amount) throws Exception {
    // // 한도 범위 초과 시 예외처리
    // if (super.getBalance() + this.creditLine < amount) {
    // throw new Exception
    // ("한도 범위를 초과합니다. 이 카드의 한도는 " + (super.getBalance() + this.creditLine) + "원
    // 입니다.");
    // }
    // // 잔액 = 잔액 - 사용액
    // super.setBalance(super.getBalance() - amount);
    // this.lastWithdrawnAmount = amount;
    // }

    // }
    @Override
    void withdraw(long amount) throws Exception {
        long totalLimit = super.getBalance() + this.creditLine; // 예금액과 신용카드 한도를 합산한 총 한도

        // 예금액이 0일 경우
        if (super.getBalance() == 0) {
            if (totalLimit < amount) {
                throw new Exception("한도 범위를 초과합니다. 현재 남은 한도는 " + this.creditLine + "원입니다.");
            }
        } else {
            // 예금액과 신용카드 한도를 합산하여 출력
            if (totalLimit < amount) {
                throw new Exception("한도 범위를 초과합니다. 이 카드의 한도는 현재 예금액 "
                        + super.getBalance() + "원과 신용카드 한도 " + this.creditLine + "원을 포함한 "
                        + totalLimit + "원입니다.");
            }
        }

        super.setBalance(super.getBalance() - amount); // 잔액 차감
        this.lastWithdrawnAmount = amount; // 마지막 출금액 저장
    }

    public static void main(String[] args) {
        CreditLineAccount creditLineAccount = new CreditLineAccount("110-11", "kang", 100, 3000000);

        try {
            creditLineAccount.withdraw(3500000); // 한도 초과 금액
        } catch (Exception e) {
            // 예외 메시지 출력
            System.out.println(e.getMessage());
        }

        CreditLineAccount creditLineAccount2 = new CreditLineAccount("110-11", "kang", 0, 3000000);

        try {
            creditLineAccount2.withdraw(3500000); // 예금액 0인 경우 한도 초과 금액
        } catch (Exception e) {
            // 예외 메시지 출력
            System.out.println(e.getMessage());
        }
    }
}
