package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {

        // float(소수점없는 자리) , double (소수점 까지 표현하려면)
        float score2 = 90.14f; // 소수점 넣으면 소수점 잘림 소수점 넣으려면 숫자 뒤에 f를 붙임
    
        double score1 = 98.5d; // 소수점 까지 표현되지만 구분을 위해 d를 붙인다

        System.out.println("socre1 ="+ score1);
        System.out.println("socre2 ="+ score2);
        System.out.printf("socre2 = %f\n" ,score2);
        System.out.printf("socre2 = %.2f\n" ,score2);// 소수점 2번째 자리 까지만 표시





    
}
    
}
