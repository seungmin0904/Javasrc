package op;
public class CompareEx2 {
    public static void main(String[] args) {

        //비교 연산자 true , flase
        //크다,작다 크거나 작다 < ,> ,<=, >=
        // ==(같은) , !=(다른)
        // %19.17f : 19자리로 표현 소수점 17자리까지 나오게

        float f1 = 0.1f;
        double d1 =0.1;
        double d2 = (double)f1; // 형변환 시켜도 원래의 값으로 저장됨
        System.out.printf("10.0 == 10.0f %b\n", 10.0 == 10.f);
        System.out.printf("0.1 == 0.1f %b\n" , 0.1 == 0.1f);
        System.out.printf("f1 = %19.17f\n" , f1);
        System.out.printf("d1 = %19.17f\n" , d1);
        System.out.printf("d2 = %19.17f\n" ,d2);
        System.out.printf("f1 == d1 %b\n" , f1 == d1);
        System.out.printf("d1 == d2 %b\n" , d1 == d2);
        System.out.printf("d2 == d1 %b\n" , d2 == d1);
        System.out.printf("(float)d1 == f1 %b\n" , (float)d1 == f1);



    
    }
}
