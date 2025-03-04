package array;

import java.util.Arrays;

public class arrayEx9 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));

        // int a = 10, b = 15;
        // int tmp = a;
        // a = b;
        // b = tmp;

        for (int i = 0; i < 100; i++) {
            // 교환 위치 임의생성 : 0~9
            int pos = (int) (Math.random() * 10);

            int tmp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = tmp;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
