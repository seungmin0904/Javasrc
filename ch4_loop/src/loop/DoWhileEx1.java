package loop;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // do wile 실행 후 조건 검사
        // for , while 과의 차이는 무조건 한번은 실행한다
        // 1~100 사이의 숫자를 컴퓨터가 임의 생성 / 생성 된 숫자 맞추기
        // 1~100 사이의 임의의 숫자 입력 받아서 컴퓨터 숫자와 비교 후 더 큰 수 입력 or 더 작은수 입력 or 정답 메세지 출력

        Scanner scan = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // input에 입력받은 값 저장

        //

        do {
            System.out.print("1 ~ 100 사이의 정수를 입력 >> ");
            input = scan.nextInt();

            if (answer < input) {
                System.out.println("땡 ! Down ");
            } else {
                System.out.println("땡 ! Up ");

            }

        } while (input != answer);
        System.out.println("정답");
    }

}
