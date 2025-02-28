package array;

// 배열
// 같은 타입의 여러변수를 하나에 묶음으로 다루는 개념
// 배열의 크기는 변경 불가 
public class arrayEx1 {
    public static void main(String[] args) {
        // 학생 100명의 점수를 입력
        // int stu1 = sc.nextInt();
        // int[] 배열명 = new int[100]; : 배열을 선언하고 생성한다

        int[] scores = new int[5]; // 점수를 모를때 입력받으면 됨 , 공간 인덱스 값을 정하면 바꿀 수 없다

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 74, 100 }; // 점수를 알때 직접 입력 , 선언과 초기화를 한번에 진행
        // 세번째 학생의 점수 출력
        System.out.println("세번째 학생의: " + scores2[2]);
        System.out.println("배열 길이 : " + scores2.length);

        // 다섯번째 학생 점수를 수정
        scores2[4] = 98;
        System.out.println("다섯번째 학생의: " + scores2[4]);

        // ArrayIndexOutOfBoundsException
        System.out.println(scores2[5]);

    }

}
