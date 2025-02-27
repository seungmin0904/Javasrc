package condition;

import java.util.Scanner;

public class ifTest9 {
    public static void main(String[] args) {
        // 윤년 , 평년 구하기
        // 연도를 입력받기
        // 입력받은 년도가 윤년인지 평년인지
        // 윤년 : 년도를 4로 나눈 나머지가 0이고 , 년도를 100으로 나눈 나머지가 0이 아니면
        // or
        // 년도를 400으로 나눈 나머지가 0이면

        int years;

        Scanner scan = new Scanner(System.in);
        System.out.println("년도를 입력하세요");
        String input = scan.nextLine();
        years = Integer.parseInt(input);

        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {

        } else {
            System.out.println("평년");
        }

    }

}
