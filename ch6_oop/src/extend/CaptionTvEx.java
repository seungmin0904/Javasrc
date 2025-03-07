package extend;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 부모 인스턴스 생성
        Tv tv = new Tv();

        // 자식 인스턴스 생성
        CapstionTv capstionTv = new CapstionTv();
        capstionTv.channel = 10;
        capstionTv.chanUp();
        System.out.println("현재 채널 : " + capstionTv.channel);
        capstionTv.displaycaption("Hello");
        capstionTv.caption = true;
        capstionTv.displaycaption("Hello");

    }
}
