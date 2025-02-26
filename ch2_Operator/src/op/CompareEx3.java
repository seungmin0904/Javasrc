package op;
public class CompareEx3 {
    public static void main(String[] args) {
    
        //비교 연산자 true , flase
        //크다,작다 크거나 작다 < ,> ,<=, >=
        // ==(같은) , !=(다른)
       
        //문자열은 기본타입으로 선언하지 않는다 . 객체타입으로 선언
        //대문자로 시작하면 객체타입

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc"); // 영역 구분 


        // 문자열 비교는 equals() , equalsIgnoreCase()를 사용 
        System.out.printf("str1 == sre2 = %b\n" , (str1 == str2));
        System.out.printf("str1 == sre3 = %b\n" , (str1 == str3));
        System.out.printf("str1.equals(str3) = %b\n" , (str1.equals(str3)));
        System.out.printf("str1.equalsIgnoreCase(str3) = %b\n" , (str1.equalsIgnoreCase(str3)));
        System.out.printf("str1.equalsIgnoreCase(ABC) = %b\n" , (str1.equalsIgnoreCase("ABC")));






       


    
    }
}
