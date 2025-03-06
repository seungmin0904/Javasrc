package oop;

public class TvEx1 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2(60, "white");
        // 티비켜기
        tv2.power();
        // 채널 변경
        tv2.changeChannel(7);

        Tv2 tv3 = new Tv2(0, null);
        tv3.power();
        tv3.changeChannel(0);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString());

        obj1.setSize(60);
        obj1.setColor("green");
        System.out.println("색상 : " + obj1.getColor());
        System.out.println("사이즈 : " + obj1.getSize());

    }
}
