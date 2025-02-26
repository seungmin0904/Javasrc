package op;

public class ArthmeticEx1 {
 public static void main(String[] args) {
    int a = 10;
    int b = 4;

    //자바 나누기는 기본적으로 소수점 날린다
    //소수 점 표현 a/(float)b) ,a/(double)b)
    // 타입이 다른 경우 byte 값이 큰쪽으로 변환 a(int) / b(float) 

    System.out.printf("%d +%d = %d\n" ,  a, b , a+b);
    System.out.printf("%d -%d = %d\n" ,  a, b , a-b);
    System.out.printf("%d *%d = %d\n" ,  a, b , a*b);
    System.out.printf("%d / %d = %d\n" ,  a, b , a/b);
    System.out.printf("%d / %f = %f\n" ,  a, (float)b , a/(float)b);



 }
    
}
