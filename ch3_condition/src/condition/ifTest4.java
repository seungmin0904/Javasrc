package condition;

import java.util.Scanner;

public class ifTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요>>");
        String input = scan.nextLine();
        int score = Integer. parseInt(input);
        char grade;

        
        // score 점수를 입력받아
        // score  >= 90 등급은 A입니다 : if 
        // score  >= 80 등급은 B입니다 : elseif
        // score  >= 70 등급은 C입니다 : elseif
        // score  >= 60 등급은 D입니다 : elseif
        // score  < 60 등급은 F입니다 : else
        

        if (score > 90){
            grade = 'A';}

            else if (score >=80){
            grade ='B';}

            else if (score >= 70){
            grade = 'C';}

            else if (score >=60){
            grade = 'D';}
            else {
            grade = 'F';}


            System.out.println("등급은 " + grade + "입니다");

            scan.close();
    
        }

    }
    

