package condition;

import java.util.Scanner;

public class ifTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        String input = scan.nextLine();
        int score = Integer. parseInt(input);

        
        // score 점수를 입력받아
        // score 가 90보다 크면 점수가 90점 이상입니다, 등급은 A입니다
        // 90보다 작으면 점수가 90점 미만입니다, 등급은 B입니다

        if (score > 90){
            System.out.println("점수가 90점 이상입니다");
            System.out.println("등급은 A입니다");
    
         } else {
            System.out.println("점수가 90점 미만입니다");
            System.out.println("등급은 B입니다");
         }

         scan.close();

         





         

  
        
    }
    
}
