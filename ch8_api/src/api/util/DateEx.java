package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        // import java.text.SimpleDateFormat;
        // import java.util.Date;

        Date d = new Date();
        System.out.println(d);
        // yyyy : 년도 , yy : 년도
        // MM : 월
        // dd : 일
        // hh : 시
        // mm : 분
        // ss : 초
        // a : 오전 오후 구분 AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh-mm-ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("이번달은 L월달임");
        System.out.println(sdf.format(d));
    }

}
