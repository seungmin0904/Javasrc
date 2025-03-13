package api.string;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        // String은 원본 문자열 변경이 불가, 매번 기존의 메모리를 해제하고 재생성
        String str1 = "안녕";
        str1 += "반가워";
        str1 += "ㅇㅇ";

        StringBuffer sb = new StringBuffer("안녕");
        sb.append("반가워").append("ㅎㅇ");
        System.out.println(sb);

        // String : 오버라이딩으로 사용
        String str2 = new String("하이");
        String str3 = new String("하이");
        System.out.println(str2.equals(str3) ? "같음" : "다름"); // 같음

        // StringBuffer : 상속 원본 그대로 사용
        StringBuffer sb1 = new StringBuffer("안녕하세요");
        StringBuffer sb2 = new StringBuffer("안녕하세요");
        System.out.println(sb1.equals(sb2) ? "같음" : "다름"); // 다름

        // String equals 사용하기 위해 변환 주소값 비교 > 값비교로 변환
        String obj1 = new String(sb1);
        String obj2 = sb2.toString();
        System.out.println(obj1.equals(obj2) ? "같음" : "다름");

        // str1 거꾸로 출력 : charAt(30)

        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));

        }
        System.out.println();

        StringBuffer sb3 = new StringBuffer(str1);
        System.out.println(sb3.reverse());
        // 거꾸로 출력 하는 메소드
        System.out.println(sb.reverse());

        // delete()지움 , insert()삽입 : 원본변경
        System.out.println("sb 위치 0,1 을 지우면 : " + sb1.delete(0, 1));
        System.out.println(sb1.insert(0, "하"));

        // replace() : 원본변경
        System.out.println(sb1.replace(0, 2, "앙녕"));

    }
}
