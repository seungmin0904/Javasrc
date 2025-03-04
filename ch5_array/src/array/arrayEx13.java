package array;

// 2차원 배열 : 행 열
// 타입[][] 배열명 = new 타입[3][3]
public class arrayEx13 {
    public static void main(String[] args) {

        // 배열 선언 , 생성
        int[][] arr1 = new int[2][2]; // 2행 2열
        // 기본값을 원하는 값으로 초기화
        arr1[0][0] = 73;
        arr1[0][1] = 83;
        arr1[1][0] = 63;
        arr1[1][1] = 53;

        // 배열 출력
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        // 향상된 for
        for (int[] tmp : arr1) {
            for (int is2 : tmp) {
                System.out.print(is2 + "\t");

            }
            System.out.println();
        }

        // 값을 알고있는 경우
        int sum = 0;
        int arr2[][] = {
                { 100, 100, 100 },
                { 20, 30, 40 }
        };
        for (int[] temp : arr2) {
            for (int is : temp) {
                sum += is;
            }
        }
        System.out.println("합계: " + sum);
    }
}
