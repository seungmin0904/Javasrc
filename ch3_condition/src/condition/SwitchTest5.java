package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 점수를 입력받은 후 점수에 따라 등급 출력
        // 90점 이상이면 A , 80 B , 70 C , F
        // 90/ 10 = 9 , 80 / 10 = 8 

        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        String input = scan.nextLine();
        int score = Integer.parseInt(input);

        

        switch (score / 10) {
            case 9:
                System.out.println("등급은 A입니다");
                break;
            case 8:
                System.out.println("등급은 B입니다");
                break;
            case 7:
                System.out.println("등급은 C입니다");
                break;

            default:
                System.out.println("등급은 F입니다");
                break;
        }
    }

}
