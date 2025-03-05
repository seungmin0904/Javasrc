package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Method method = new Method();

        // 메서드 호출
        int result = method.add(8, 9);
        System.out.println(result);

        float result1 = method.add2(9, 45.9f);
        System.out.println(result1);

        System.out.println(method.add(48, 46));

        method.print("홍길동", "s123");

        int arr[] = { 1, 2, 3 };
        int arr2[] = method.arr(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
