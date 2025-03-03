package array;
// int [][] array; // 2차 배열 기본 선언

// array = new int [1] [5]; // 2차 배열 초기화 : 배열 갯수 정의 > [] :행(세로) + [] :열(가로)
// int [][] array2 = new int [1] [5]; // 2차 배열 선언 and 초기화
// int [][] array3 = {{1,2,3}, {4,5,6}}; // 입력되는 값을 알고있을때 수를 직접 지정하여 출력

// System.out.println(array.length); // 선언된 배열의 행의 갯수 5행 : 컴퓨터는 0부터 시작 0,1
// System.out.println(array[0].length);// 2차 배열의 0행의 열의 갯수 여기에서 [] 역할은 행을 의미
// System.out.println(array[1].length);
// System.out.println(array[2].length);
// System.out.println(array[3].length);
// System.out.println(array[4].length);// 2차 배열의 1행의 열의 갯수

public class arrayEx0 {
    public static void main(String[] args) {
        // 2차 배열 5행 5열의 배열을 생성하시오
        // 2차 배열의 0행의 0열에 정수 값을 넣어라
        // 2차 배열의 각 행과 열의 총합을 구하시오
        // 각 행과 열의 합을 출력하시오
        // 증감이 이루어지지 않았을때는 합을 출력하지 않는다.
        // 배열의 최소값과 최대값을 찾고 최소값과 최대값 인덱스의 위치를 출력하시오
        int[][] array = new int[5][5];
        boolean isFirstValue = true;
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][3] = 100;

        int sum = 0;
        int min = Integer.MAX_VALUE, minRow = -1, minCol = -1; // 최소값 및 위치 초기화
        int max = Integer.MIN_VALUE, maxRow = -1, maxCol = -1; // 최대값 및 위치 초기화

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    sum += array[i][j];

                    // 최소값 업데이트 (값과 위치 저장)
                    if (array[i][j] < min) {
                        min = array[i][j];
                        minRow = i;
                        minCol = j;
                    }

                    // 최대값 업데이트 (값과 위치 저장)
                    if (array[i][j] > max) {
                        max = array[i][j];
                        maxRow = i;
                        maxCol = j;
                    }

                    if (isFirstValue) {
                        System.out.printf("\tsum[%d][%d] 의 값은 %d%n ", i, j, array[i][j]);
                        isFirstValue = false;
                    } else {
                        System.out.printf("\tsum[%d][%d] 의 값은 %d이고, 합은 %d%n ", i, j, array[i][j], sum);
                    }

                }
            }

        }
        System.out.printf("\tsum : 배열의 총합: %d%n\n", sum);
        System.out.printf("\t배열의 최소값: %d (위치: [%d][%d])%n", min, minRow, minCol);
        System.out.printf("\t배열의 최대값: %d (위치: [%d][%d])%n", max, maxRow, maxCol);
        
        // 응용 : 가변 길이 배열
        int[][] array2 = new int[3][];
        boolean isFirstValue2 = true; //첫번째 값인지 확인하는 변수 

        array2[0] = new int[2]; //1행의 열 갯수 
        array2[1] = new int[4]; //2행의 열 갯수 
        array2[2] = new int[3]; //3행의 열 갯수

        array2[0][0] = 5; // 배열 요소 값
        array2[0][1] = 10;

        array2[1][0] = 15;
        array2[1][1] = 20;
        array2[1][2] = 25;
        array2[1][3] = 30;

        array2[2][0] = 35;
        array2[2][1] = 40;
        array2[2][2] = 45;

        int sum2 = 0; // sum2 변수 초기화 
        int min2 = Integer.MAX_VALUE, minRow2 = -1, minCol2 = -1;
        int max2 = Integer.MIN_VALUE, maxRow2 = -1, maxCol2 = -1;

        System.out.println("가변 길이 배열 array2 출력:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

                if (array2[i][j] != 0) { // 배열의 최소값이 0으로 초기화 되어 있기 때문에 0이 아닌 값만 출력 하도록 함
                    sum2 += array2[i][j]; // sum2 변수에 배열의 값들을 더함
                    if (array2[i][j] < min2) {
                        min2 = array2[i][j];
                        minRow2 = i;
                        minCol2 = j;
                    }
                    if (array2[i][j] > max2) {
                        max2 = array2[i][j];
                        maxRow2 = i;
                        maxCol2 = j;
                    }
                    if (isFirstValue2) {  // 첫번째 값만 특별하게 출력하고 이후 값들과 차이를 두기 위해 사용 
                        System.out.printf("\tsum2[%d][%d] 의 값은 %d%n ", i, j, array2[i][j]);
                        isFirstValue2 = false; // true를 만족하는 isFirstValue 변수의 첫번째 값이 출력 된 후 
                                               // false로 변경하여 다음 값들은 false 조건을 만족하는 else문을 실행하도록 만듬 
                    } else {
                        System.out.printf("\tsum2[%d][%d] 의 값은 %d이고, 합은 %d%n ", i, j, array2[i][j], sum2);
                    }

                }

            }

        }
        System.out.printf("\tsum2 : 배열의 총합: %d%n\n", sum2);
        System.out.printf("\t배열의 최소값: %d (위치: [%d][%d])%n", min2, minRow2, minCol2);
        System.out.printf("\t배열의 최대값: %d (위치: [%d][%d])%n", max2, maxRow2, maxCol2);

    }
}
