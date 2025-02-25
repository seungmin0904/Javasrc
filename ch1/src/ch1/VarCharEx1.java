package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
    // 문자 : 'a' (글자 1개,공백도 포함)
    // 문자열 : "abc" (글자 여러개, 공백도 포함)
    
    // 기 문자를 ch1에 대입
    char ch1 = '기';


    // ch1 값을 unicode변수에 대입
    // int = char
    int unicode = ch1;
    System.out.println("ch1 =" + ch1);
    System.out.println("unicode =" + unicode);


    char ch2 = 'a';

    unicode = ch2;
    System.out.println("ch2 =" + ch2);
    System.out.println("unicode =" + unicode); //97

    char ch3 = 'A';

    unicode = ch3;
    System.out.println("ch3 =" + ch3);
    System.out.printf("ch3 = %c\n",ch3);
    System.out.println("unicode =" + unicode); //65




    
   
}
    
}
