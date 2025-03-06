package oop;

public class TimeEx1 {
    public static void main(String[] args) {
        Time time = new Time();

        // 시 설정

        time.setHour(11);
        time.setMinute(60);
        time.setSecond(13.2f);

        System.out.println("시 : " + time.getHour());
        System.out.println("분 : " + time.getMinute());
        System.out.println("초: " + time.getSecond());

    }
}
