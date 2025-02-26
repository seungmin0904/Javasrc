package op;

public class LogicalEx1 {
    public static void main(String[] args) {

        // 논리 연산자 : 비교연산자 여러개 연결 true ,false
        // x가 4보다 작거나 10보다 크다
        // &&(and) , || (or) , !(not)

        //x > 10 && x < 20
        //y는 2의 배수 또는 3의 배수이다
        //y % 2 == - || y % 3 == 0
        //y 는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다
        //(y % 2 == 0 || y % 3 == 0) && y % 6 ! = 0

        int x = 0;
        char ch = ' ';
        
        x = 15;
        System.out.printf("x=%2d , 10 < x && x < 20 = %b\n ", x ,10 < x && x < 20);

        x = 6;
        System.out.printf("x=%2d , x %% 2==0 || x%%3==0 && x%%6!=0 =%b\n ", x, (x %2==0 || x%3==0) && x%6!=0);
        // 0 ~ 9 숫자인지 확인
        ch = '1'; 
        System.out.printf("ch+%c, '0' <= ch && ch <= '9' = %b\n" , ch ,'0' <= ch && ch <= '9');
        //소문자인지 확인
        ch = 'a';
        System.out.printf("ch+%c, 'a' <= ch && ch <= 'z' = %b\n" , ch ,'a' <= ch && ch <= 'z');
        //대문자인지 확인
        ch = 'A';
        System.out.printf("ch+%c, 'A' <= ch && ch <= 'Z' = %b\n" , ch ,'A' <= ch && ch <= 'Z');
        //소문자 q 이거나 대문자 q인지 확인
        ch = 'q';
        System.out.printf("ch+%c, ch=='q' || ch && ch == 'Q' = %b\n" , ch ,ch=='q' ||  ch == 'Q');

        System.out.printf("ch+%c, ch=='q' || ch && ch == 'Q' = %b\n" , ch ,!(ch=='q' ||  ch == 'Q'));





    

    

    



    

    
    
}
    
}
