package array;

import java.util.Arrays;

public class arrayEx6 {
    public static void main(String[] args) {
        int arr[] = { 78, 99, 52, 35, 14 };

        // 기존 배열에 값 추가를 해야 한다면 새로운 배열 공간을 생성
        int tmp[] = new int[10];
        // 기존 배열 값을 복사(copy)
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));
        // System.arraycopy(arr, 0, tmp, 0, 0); // 범위를 지정해서 한번에 복사 , (Object src, int
        // srcPos, Object dest, int destPos, int length)
        // System.arraycopy(arr, 0, tmp, 0, 0); // 원본, 원본 위치, 새배열, 새배열 위치, 복사할 개수

        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 1, arr.length);
        System.out.println(Arrays.toString(tmp2));

    }
}
