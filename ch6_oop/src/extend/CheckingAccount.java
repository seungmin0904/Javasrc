package extend;

public class CheckingAccount extends Account {
    // 은행 계좌 + 체크카드
    private String cardNo;

    // public CheckingAccount() {
    // // 부모의 default 생성자 호출
    // super();
    // }

    public CheckingAccount(String ano, String owner, int balance, String cardNo) {
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    // 비용(체크카드 사용액) 지불
    // 사용한 카드의 번호와 은행 계좌가 일치한지 확인
    // 잔액 > 사용액
    long pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("cardNo 나 잔액을 확인하세요");

        }
        // 비용 지불 : 잔액 = 잔액 - 사용액
        withdraw(amount);
        // 결제 금액 출력
        System.out.println(amount + "원 결제");
        // 잔액 리턴
        return getBalance();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
