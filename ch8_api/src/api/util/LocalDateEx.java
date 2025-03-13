package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("년도" + date.getYear());
        System.out.println("월" + date.getMonthValue());
        System.out.println("일" + date.getDayOfMonth());
        System.out.println(" +5일 " + date.plusDays(5));
        System.out.println(" -2달 " + date.minusMonths(2));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println("시" + time.getHour());
        System.out.println("분" + time.getMinute());
        System.out.println("초" + time.getSecond());
        System.out.println(" + 5시 " + time.plusHours(5));
        System.out.println(" - 5시 " + time.minusHours(5));

    }
}
