package ch1;
//형 변환
//변수 또는 상수의 타입을 다른 타입으로 변환하는 것
// 작은 타입에서 큰타입으로의 변환은 허용
// 큰 타입에서 작은 타입은 손실이 발생 -> 강제 형 변환

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        System.out.println("d = "+ d);
        
        int score = (int)d;
        System.out.println("score = "+ score);

        // int + double => double

        int intValue = 10;
        double dblValue = 5.5;
        int result = intValue + (int)dblValue;
        System.out.printf("result = %d\n" , result);

        float f1 = 9.1234567f;
        double d1 = 9.1234567;


        double d2 = f1;
        double result2 = d1 + f1;

        int num = 97;
        char ch1 = (char)num;
        System.out.println(ch1);

    
}
    
}
