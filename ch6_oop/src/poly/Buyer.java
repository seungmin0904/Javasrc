package poly;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;

    // new Product() , new Audio() , new Computer() , new Tv() 를 모두 담을 수 있게됨
    // 구입한 제품을 담을 수 있는 배열
    Product[] products = new Product[10];
    // produvys 배열에 사용할 인덱스
    int i = 0;

    // // 물건 구매(1개)
    // // 잔액 = 잔액 - 상품가격
    // // 보너스 포인트 계산

    // void buy(Product product) {
    // if (money < product.price) {
    // System.out.println("잔액 부족으로 물건 구매 불가");
    // return;

    // }
    // // 잔액 = 잔액 - 상품가격
    // this.money -= product.price;
    // // 보너스 포인트 계산
    // bonusPoint += product.price;
    // System.out.println(product + "을/를 구매하셨습니다.");
    // }

    // 상속관계 없을때
    // void buy(computer[] computers) { }
    // void buy(Tv[] tv) { }
    // void buy(Audio[] audios) { }

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액 부족으로 물건 구매 불가");
            return;

        }
        // 잔액 = 잔액 - 상품가격
        this.money -= product.price;
        // // 보너스 포인트 계산
        // bonusPoint += product.price;
        // 구매한 물건을 products 배열에 추가(장바구니)
        products[i++] = product;

        System.out.println(product + "을/를 구매하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";
        // products 구매한 물건의 총 가격과 상품 목록
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                break;
            }
            sum += products[i].price;
            itemList += products[i] + ", ";

        }
        System.out.println("구입 하신 물건 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입 하신 제품은 " + itemList + "입니다.");

    }
}
