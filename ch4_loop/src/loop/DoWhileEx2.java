package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {
        // do wile 실행 후 조건 검사
        // for , while 과의 차이는 무조건 한번은 실행한다
        // 1~100 사이의 숫자를 컴퓨터가 임의 생성 / 생성 된 숫자 맞추기
        // 1~100 사이의 임의의 숫자 입력 받아서 컴퓨터 숫자와 비교 후 더 큰 수 입력 or 더 작은수 입력 or 정답 메세지 출력

        Scanner scan = new Scanner(System.in);
        String n1;
        System.out.println("문자를 입력하세요");

        // n1 에 입력받은 값 저장

        // 문자 입력 받은 후 출력
        // q 입력 시 반복문 종료

        do {
            System.out.println("종료를 원하면 q, Q 입력");
            System.out.print(">> ");
            n1 = scan.nextLine();
            System.out.println(n1);

        } while (n1.equalsIgnoreCase("q")); // == != => equls , equlsignorecase : " " 또는 " "

        System.out.println("종료");

    }

}
