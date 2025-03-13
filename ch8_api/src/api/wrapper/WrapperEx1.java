package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;

        System.out.println("String 숫자 > int로 반환 " + Integer.parseInt("10"));
        System.out.println("int > String 문자열로 반환 " + i.toString());

        System.out.println("두 수 중에 큰 수 반환  " + Integer.max(5, 8));
        System.out.println("두 수 중에 작은 수 반환  " + Integer.min(5, 8));

    }
}
