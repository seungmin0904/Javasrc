package oop;

public class GoodsStockEx1 {
    public static void main(String[] args) {
        // new GoodsStock(); : default 생성자를 호출하면서 인스턴스 생성
        // GoodsStock goodsStock = new GoodsStock();
        // goodsStock.pcode = "p1013";
        // goodsStock.stockNum = 50;

        GoodsStock goodsStock = new GoodsStock("p1013", 50);

        System.out.println(goodsStock);

        // 판매 - 5
        goodsStock.stockNumDown(5);

        // 현재 재고 수량
        System.out.println(goodsStock);

        // 제품이 10개 입고 됨
        goodsStock.stockNumUp(10);

        // 현재 재고 수량
        System.out.println(goodsStock);

    }
}
