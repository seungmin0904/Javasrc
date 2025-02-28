package loop;

// 이중 for문
public class forEx7 {
    public static void main(String[] args) {
        // 한줄로 * 10개
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");

            }
            System.out.println();
        }

    }

}
