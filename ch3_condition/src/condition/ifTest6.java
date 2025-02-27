package condition;

import java.util.Scanner;

public class ifTest6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요>>");
        String input = scan.nextLine();
        int score = Integer.parseInt(input);

        char grade =' ', opt='0';
        if (score >= 90) {
            grade = 'A';
            if(score>=98){
                opt = '+';
            }else if(score > 94){
                opt = '-';
            }
        }else if(score >= 80){
            grade = 'B';
            if(score>=88){
                opt='+';
            }else if(score > 84){
                opt='-';
            }
            System.out.printf("당신의 등급은 %c%c 입니다 \n", grade, opt);
        }
    }
}