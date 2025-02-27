package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {
        // 가위(1)바위(2)보(3)

        // 컴퓨터의 가위바위보
        int com = (int) (Math.random() * 3) + 1;

        // 사용자의 가위바위보

        Scanner scan = new Scanner(System.in);
        System.out.println("가위(1),바위(2),보(3) 중 입력");
        String input = scan.nextLine();
        int user = Integer.parseInt(input);

        // 2(바위) - 1(가위) = 1(컴퓨터가 이겼음)
        

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("컴퓨터가 이겼습니다");
                break;
            case 1:
            case -2:
                System.out.println("유저가 이겼습니다");
                break;

            case 0:
                System.out.println("비겼습니다");

        }

    }

}
