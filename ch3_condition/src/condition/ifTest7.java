package condition;

import java.util.Scanner;

public class ifTest7 {
    public static void main(String[] args) {
        // num =1 변수 선언 후 임의의 값 담기
        //int num1 =25;

        //사용자로부터 입력을 받아 num1이라는 변수에 담고
    
        // num =1 이 짝수인지 홀수인지
        // num1 % 2==0

        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요>>");
        String input = scan.nextLine();
        int num1 = Integer.parseInt(input);

        if (num1 % 2==0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }


    }
    
}
