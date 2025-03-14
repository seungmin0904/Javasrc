package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        Integer[] arr = { 32, 23, 14, 65, 6 };
        // 배열안에 15가 들어있는가
        Arrays.sort(arr);
        // Arrays.binarySearch(arr, 15);
        System.out.println(Arrays.binarySearch(arr, 23));

        // 배열 비교
        Integer[] arr1 = { 32, 23, 14, 65, 6 };
        Integer[] arr2 = { 32, 23, 14, 65, 8 };
        System.out.println(Arrays.equals(arr1, arr2));

    }
}
