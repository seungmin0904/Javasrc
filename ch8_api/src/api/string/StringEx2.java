package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세요";

        // 문자열 길이
        System.out.println("문자열 길이 " + str.length());
        System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(0));
        System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(4));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        // char 배열로 변환
        char[] chArr = new char[str.length()];
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = str.charAt(i);

        }

        System.out.println("chArr " + Arrays.toString(chArr));

        // String => char배열로 변환
        char[] result = str.toCharArray();

        // indexOf(str): 주어진 문자가 문자열에 존재하면 0 없으면 -1로 반환함
        System.out.println("주어진 문자가 문자열에 존재하는지 여부" + str.indexOf("안"));
        System.out.println("주어진 문자가 문자열에 존재하는지 여부" + str.indexOf("바"));

        System.out.println("주어진 문자가 문자열에 존재하는지 여부" + str.contains("안"));

        // 자바 문자가 있으면 자바와 관련 있는 책입니다. / 자바와 관련 없는 책입니다
        String subject = "자바의 정석";
        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련있는 책입니다.");
        } else {
            System.out.println("자바와 관련없는 책입니다.");
        }

        if (subject.contains("자바")) {
            System.out.println("자바와 관련있는 책입니다.");

        } else {
            System.out.println("자바와 관련없는 책입니다.");

        }

        // 찾기 시작하는 위치도 지정가능
        System.out.println(str.indexOf("하", 4));

        String str2 = "java.lang.String";
        // 시작지점부터 값의 위치 찾기
        System.out.println(str2.indexOf("."));
        // 끝지점 부터 값의 위치 찾기
        System.out.println(str2.lastIndexOf("."));
        // 값의 위치 결과는 왼쪽부터 순서대로

    }

}
