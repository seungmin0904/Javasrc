package poly;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 부모 타입의 참조 변수로 자식 인스턴스 참조
        Tv2 tv = new CapstionTv();

        // 자식 인스턴스 생성

        tv.channel = 10;
        tv.chanUp();
        System.out.println("현재 채널 : " + tv.channel);

        // 캐스팅(강제 형변환)을 통해 자식의 멤버에 접근한다

        CapstionTv ctv = (CapstionTv) tv;

        ctv.displaycaption("Hello");
        ctv.caption = true;
        ctv.displaycaption("Hello");

    }
}
