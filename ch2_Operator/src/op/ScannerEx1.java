package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in (키보드)
        // System.Out(화면)
        
        // Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 코드 

        // System.out.println("두자리 정수 입력");
        // String input = scanner.nextLine(); // 입력값을 변수에 받아오는 코드 , nextLine() : 문자열로 받아옴 
        
        // int num = Integer. parseInt(input);// "45" ㅡ> 45
        
        // System.out.println("입력값 : " + num);

        // scanner.close();
        
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("====제곱계산기====");
        System.out.println("숫자를 입력");

        int num = scan.nextInt();
        System.out.println(num + "*" + num + "=" +num*num);

        
        

    }
    
}
