package array;

import java.util.Arrays;

public class arrayEx2 {
    public static void main(String[] args) {
        // 길이가 10인 int 형 배열 생성

        int[] arr = new int[10]; // 10개의 공간이 0으로 셋팅 , 대괄호는 변수명 뒤나 앞 모두 허용

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10; // 공간 안의 0에 10을 더하고 그 더한 값을 중복해서 10씩 더해나감
        }
        // 배열 요소의 값을 확인
        // 1) for 문 사용 : 원하는 형태로 출력이 가능
        // 2) 향상된 for 문 사용 : 1) 과 같음
        // 3) Arrays.toString(배열명) : [배열 요소 출력] => 확인용
        System.out.println(Arrays.toString(arr));
        int idx = 0;
        for (int i : arr) { // 기본 적으로 index 사용 못함 사용하려면 index 값을 변수 선언 후 변수값 + 문자열 등으로 합침
            System.out.print(++idx + " : " + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
