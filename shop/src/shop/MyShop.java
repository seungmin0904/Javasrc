package shop;

// list를 활용해 수정 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {
    Scanner sc = new Scanner(System.in);

    private String title;

    // 고객 5명 저장 가능한 배열 생성
    // private User[] users = new User[5];
    List<User> users = new ArrayList<>();

    // 상품목록 배열 생성
    // Product[] products = new Product[10];
    List<Product> products = new ArrayList<>();

    // cart (제품 저장 가능한 배열)
    // Product[] cart = new Product[10];
    List<Product> cart = new ArrayList<>();

    // Start()에서 선택 된 user 보관변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2명의 user를 생성 후 배열객체에 담기
        // users[0] = new User("홍길동", Paytype.CARD);
        // users[1] = new User("성춘향", Paytype.CASH);
        users.add(new User("홍길동", Paytype.CARD));
        users.add(new User("성춘향", Paytype.CARD));

    }

    @Override
    public void genProduct() {
        // 제품을 10개 담을 배열 생성(tv2개 , cellphone 2개)
        products.add(new Cellphone(" - 아이폰17프로 언제나옴 - ", 1000000, "Apple"));
        products.add(new Tv(" -가전은 LG- ", 2000000, "4K해상도"));

    }

    @Override
    public void start() {

        int i = 0;
        System.out.println(title + " 메인 화면 - 계정선택");
        System.out.println("================================");
        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[X] 종료 ");
        System.out.println("=================================");
        System.out.println("선택 : ");

        String input = sc.nextLine();

        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                // 사용자가 선택한 user 정보 담기(check out 메소드 필요)
                selUser = input;
                productList();
                break;

            default:
                System.out.println("입력을 확인해주세요");
                start();
                break;
        }

    }

    public void productList() {
        int i = 0;
        System.out.println(title + " 상품목록 - 상품선택");
        System.out.println("================================");

        for (Product products : products) {
            if (products != null) {
                System.out.printf("[%d]", i++);
                products.printDetail();

                // System.out.println();
                // i++;
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");

        System.out.println("=================================");
        System.out.print("선택 : ");

        // 0~4 or h or c
        String input = sc.nextLine();

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                // cart 배열에 선택한 제품담기
                cart.add(products.get(Integer.parseInt(input)));
                productList();
                break;

            case "h":
                start();
                break;

            case "c":
                checkout();
                break;

            default:
                break;
        }

    }

    public void checkout() {
        System.out.println(title + " : " + users.get(Integer.parseInt(selUser)).getName() + "체크아웃");
        System.out.println("=============================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s(%s)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("결제 방법 : " + users.get(Integer.parseInt(selUser)).getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("=============================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.println("선택 : "); // p => productList() , q => 종료

        String input = sc.nextLine();
        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.exit(0);
                break;

            default:
                break;
        }
    }
}
