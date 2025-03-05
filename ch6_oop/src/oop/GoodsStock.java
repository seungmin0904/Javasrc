package oop;

public class GoodsStock {
    // 속성 : code(상품코드) ,stockNum(재고수량)
    // 기능 : 재고 추가, 재고 감소
    String pcode;
    int stockNum;

    // 값이 무조건 들어와야 할때 생성자를 써볼 수 있다
    // () 안에 아무것도 없으면 default 생성자
    // public GoodsStock() {
    // }

    void stockNumDown(int num) {
        this.stockNum -= num;
    }

    public GoodsStock(String pcode, int stockNum) {
        this.pcode = pcode;
        this.stockNum = stockNum;
    }

    void stockNumUp(int num) {
        this.stockNum += num;
    }

    @Override
    public String toString() {
        return "GoodsStock [pcode=" + pcode + ", stockNum=" + stockNum + "]";
    }
}
