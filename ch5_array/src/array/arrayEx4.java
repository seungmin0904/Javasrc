package array;

// 배열 요소의 값을 확인
// 1) for 문 사용 : 원하는 형태로 출력이 가능
// 2) 향상된 for 문 사용 : 1) 과 같음
// 3) Arrays.toString(배열명) : [배열 요소 출력] => 확인용

import java.util.Arrays;
import java.util.Scanner;

public class arrayEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 5명 학생의 수학점수를 입력받아서 평균, 총합 구하기

        double[] arr;

        System.out.print("학생 수 입력 >> ");
        // int num = sc.nextInt();
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        // 배열 생성
        arr = new double[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 학생 점수 입력 >> ", (i + 1));
            arr[i] = sc.nextDouble();

        }

        System.out.println(Arrays.toString(arr));
        // 평균, 총합
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // sum = sum + arr[i];
            sum += arr[i];
        }
        // System.out.printf("총합 : %d, 평균 : %d\n", sum, sum / arr.length);
        System.out.printf("총합 : %d, 평균 : %.2f\n", sum, (double) sum / arr.length); // 소수점 2f 자리 까지
    }

}
