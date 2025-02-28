package loop;
// 구구단 전체

public class forEx11 {
    public static void main(String[] args) {
        // for (int i = 2; i <= 9; i++) {
        // for (int j = 1; j <= 9; j++) {
        // System.out.printf("%d x %d = %d\n", i, j, i * j); // 세로로 쭉
        // }
        // }

        // for (int i = 2; i <= 9; i++) {
        // for (int j = 1; j <= 9; j++) {
        // System.out.printf("%d x %d = %d\t", i, j, i * j); // 가로로 한줄 씩 1단 2단 3단
        // }
        // System.out.println();
        // }
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\t", i, j, i * j); // 가로로 한줄 씩 1단 2단 3단
            }
            System.out.println();
        }

    }

}
