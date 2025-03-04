package array;

// 가변 배열
public class arrayEx15 {
    public static void main(String[] args) {
        int[][] score = new int[3][];
        // 행마다 다른 길이 지정
        score[0] = new int[4];
        score[1] = new int[2];
        score[2] = new int[3];

        // score[0][0] = 78; // 배열 요소 값
        // score[0][1] = 99;
        // score[0][2] = 25;
        // score[0][3] = 35;

        // score[1][0] = 12;
        // score[1][1] = 15;

        // score[2][0] = 35;
        // score[2][1] = 65;
        // score[2][2] = 75;

        int[][] score2 = {
                { 78, 99, 25, 35 },
                { 12, 15 },
                { 35, 65, 75 }
        };

        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2.length; j++) {
                System.out.print(score2[i][j] + "\t");
            }
        }
        System.out.println();

    }
}
