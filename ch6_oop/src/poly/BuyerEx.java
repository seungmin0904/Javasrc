package poly;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // buyer Tv를 산다
        buyer.buy(new Tv());
        buyer.buy(new computer());
        buyer.buy(new Audio());
        buyer.summary();

        // System.out.println("남은 돈은 " + buyer.money + "만원 입니다");
        // System.out.println("현재 보너스 포인트는 " + buyer.bonusPoint + " 입니다");

        // 여러 객체를 한꺼번에 다루기 - 배열객체
        // 상속관계가 없을 때 코드 작성
        // 컴퓨터 여러대 tv 여러대 담고 싶으면 배열 활용
        // computer computer[] = new computer[3];
        // Tv tv[] = new Tv[3];
        // Audio audio[] = new Audio[3];

        // computer[0] = new computer();
        // computer[1] = new computer();
        // computer[2] = new computer();

        // tv[0] = new Tv();
        // audio[0] = new Audio();

        // buyer.buy(computer);
        // buyer.buy(tv);
        // buyer.buy(audio);

        // 상속관계 = > 매게변수 다형성

    }
}
