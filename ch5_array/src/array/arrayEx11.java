package array;

import java.util.Arrays;

//정렬(오름차순, 내림차순) , 클래스 메소드 입력하면 됨
//버블 정렬
public class arrayEx11 {
    public static void main(String[] args) {
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] > score[j + 1]) {
                    getTemp(score, j);
                }
            }
        }
        System.out.println(Arrays.toString(score));
    }

    private static void getTemp(int[] score, int j) {
        int temp = score[j];
        score[j] = score[j + 1];
        score[j + 1] = temp;
    }
}
