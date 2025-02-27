package ch1;

// 변수의 유효범위
// {} 안에서 선언 된 변수는 {} 벗어난 곳에서는 사용 불가
public class ScopeEx1 {
    public static void main(String[] args) {

        int a =100;

        {
            int x = 10;
            System.out.println("x=" + x);
            System.out.println("x=" + a);
        }
            int c = 12;
            System.out.println("x=" + a);
            System.out.println("x=" + c);
            // System.out.println("x=" + x); 
            // x cannot be resolved to a variable 

            if (a < 200) {
                int sum = 0;   
            }
             // System.out.println(sum); // {} 안에서 선언된 변수의 값을 {}밖에서 출력 하려면 {} 안의 변수를 밖으로 내보내야함

             for (int i = 0; i < args.length; i++) {
                
             }
             // System.out.println(i);
    }

}
