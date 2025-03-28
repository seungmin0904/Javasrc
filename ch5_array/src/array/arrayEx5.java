package array;

import java.util.Arrays;

public class arrayEx5 {
    public static void main(String[] args) {
        // char 값 5개
        // 배열 선언 시 타입 , 배열명 = [] : 값을 알고있으면

        char arr[] = { 'a', 'b', 'c', 'd', 'e' }; // 배열 선언 하고 생성한 모습

        // 배열 길이를 알고싶다
        System.out.println("길이 : " + arr.length);

        // 배열 요소 확인
        System.out.println(arr); // 1 : 값을 그냥 출력함 , char 형만 허용
        System.out.println(Arrays.toString(arr)); // 2 : [] 안에 배열 값을 넣어 출력

        // 배열 요소 변경

        arr[2] = 'f';
        System.out.println(Arrays.toString(arr));

        // double 배열 선언 , 생성(5)

        double arr2[] = { 90.5, 88.12, 79.56, 25.6, 25 };
        System.out.println(arr2); // D@1be6f5c3 > 주소
        System.out.println(Arrays.toString(arr2));
        // Arrays.toString() : 배열명이 가리키는 곳의 실제 값을 출력

        // int [][] array; // 2차 배열 기본 선언
        // array = new int [1] [5]; // 2차 배열 초기화 : 배열 갯수 정의 > [] :행(세로) + [] :열(가로)
        // int [][] array2 = new int [1] [5]; // 2차 배열 선언 and 초기화
        // int [][] array3 = {{1,2,3}, {4,5,6}}; // 입력되는 값을 알고있을때 수를 직접 지정하여 출력

    }

}
