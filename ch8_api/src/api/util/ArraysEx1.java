package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {

        Integer[] arr = { 32, 23, 14, 65, 6 };
        // 정렬(기본 오름차)
        Arrays.sort(arr);
        // 정렬 후
        System.out.println(Arrays.toString(arr));

        // 내림차 순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());
        // 정렬 후
        System.out.println(Arrays.toString(arr));

        // 문자 정렬
        Character[] cha = { 'a', 'k', 'b', 't', 'o' };
        // 오름차 순 정렬
        Arrays.sort(cha, Comparator.naturalOrder());
        // 정렬 후
        System.out.println(Arrays.toString(cha));
    }
}
