package condition;

public class SwitchTest1 {
    public static void main(String[] args) {

        // Switch : if , else if , else 를 대체함

        int num = (int) (Math.random() * 6) + 1;
        


        switch (num) {
            case 1: // case 1: num이 1이라면 num==1 (크다 ,작다x)
                System.out.println("주사위 1번");
                break;
            case 2:
                System.out.println("주사위 2번");
                break;
            case 3:
                System.out.println("주사위 3번");
                break;
            case 4:
                System.out.println("주사위 4번");
                break;
            case 5:
                System.out.println("주사위 5번");
                break;

            default:
                System.out.println("주사위 6번");
                break;
        }

    }

}
