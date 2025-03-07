package oop;
// Import 문

// 다른 패키지의 클래스 사용할 때
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import extend.Parent;
import static java.lang.Math.*;

// Import 사용하지 않는 패키지(자동으로 Import 처리해줌)
// java.lang.* (lang 패키지에 속한 모든(*) 클래스 )
public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(" 오늘 날짜는 : " + sdf.format(date));

        // Math는 Import 구문이 들어오지 않음
        // Math : static 메소드로 선언됨

        // System.out.println(Math.min(15, 025)); // import static 으로 import 구문에 삽입하면
        // 메소드 만으로 호출 가능
        System.out.println(min(15, 025));

        // System.out.println(Math.random());
        System.out.println(random());

    }
}
