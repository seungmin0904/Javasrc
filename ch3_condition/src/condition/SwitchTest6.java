package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자 , 피연산자 입력 받은 후 계산해서 결과 출력
        // + , - , * , / , %

        // 5-3 = 2

        Scanner scan = new Scanner(System.in);
        System.out.println("연산자를 입력하세요");
        String op = scan.nextLine();
        
        System.out.println("첫번째 피연산자를 입력하세요");
        String input = scan.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두번째 피연산자를 입력하세요");
        input = scan.nextLine();
        int num2 = Integer.parseInt(input);

        
        // 출력문
        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;

            default:
                System.out.println("입력값을 확인해주세요");
                //System.exit(0);
                break;

        }
        
        System.out.printf("%d %s %d = %d", num1, op, num2, result);

    }

}
