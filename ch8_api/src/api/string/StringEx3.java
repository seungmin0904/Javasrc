package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {

        String str = "Hello";
        // 문자열 연결 : +
        str += "World";
        System.out.println(str);

        // concat() : 문자열 연결 : +
        String str2 = "안녕하세요";
        str2 = str2.concat("반갑습니다");
        System.out.println(str2);

        // endsWith() : 지정된 문자로 끝나는지 , startWith()
        System.out.println(str.endsWith("요"));
        System.out.println(str.startsWith("요"));

        String file = "test.txt";
        // 이미지 : png, gif, jpg
        if (file.endsWith("jpg") || file.endsWith("gif") || file.endsWith("png")) {

            System.out.println("이 파일은 이미지 파일입니다" + file.endsWith("jpg"));
        }
        System.out.println("이 파일은 이미지 파일이 아닙니다");

        // replace() : 문자열을 지정해 새로운 문자열로 반환(원본 변경 불가)
        System.out.println("replace(old,new) " + str.replace("Hello", "안녕하세요"));
        System.out.println(str);

        // 원본 변경 : 초기화 개념으로 접근 해야 변경 가능
        str = str.replace("Hello", "안녕하세요");
        System.out.println(str);
        // replaceAll() : 정규식 사용 가능
        // 문자열 중 지정 된 타입에 따른 문자열 전체를 사용자가 지정한 문자열로 바꿔준다
        System.out.println(str.replaceAll("[a-z]", "1"));

        // 변수에 선언 된 문자열에서 지정한 첫번째에 해당하는 문자열을 바꿔준다
        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("ll", "LL"));

        // substing() : 새로운 문자열 반환
        str2 = "java.lang.Object";
        System.out.println("특정 위치의 문자열 얻기" + str2.substring(10));
        // 끝 위치는 포함하지 않음(11 = 10)
        System.out.println(str2.substring(0, 11));

        // split()
        str2 = "dog,cat,bear";
        System.out.println("지정한 분리자로 나누어 배열로 반환" + Arrays.toString(str2.split(",")));

        // 지정된 숫자만큼 분리
        String[] arr = str2.split(",", 2);
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자 or 소문자 변경
        str2 = "HEllo";
        System.out.println("소문자 변경" + str2.toLowerCase());
        System.out.println("대문자 변경" + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        String str3 = "         Hello           ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // valueOf() : 문자열로 반환
        int i = 5; // index값 5 >> 문자열 "5"
        String str4 = String.valueOf(i); // 이렇게 하거나
        System.out.println(str4);

        str4 = i + ""; // 이렇게 해도 됨
        System.out.println(i);
    }
}
