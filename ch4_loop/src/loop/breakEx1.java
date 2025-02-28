package loop;

public class breakEx1 {
    public static void main(String[] args) {
        // break : switch. 반복문 중지(break 가 포함 된 가장 가까운 반복문 탈출)

        int sum = 0, i = 0;

        while (true) {
            // if 에서 실행 할 구문이 하나 인 경우 {} 생략가능 , 가급적 사용
            // sum 값이 100보다 큰경우 break
            if (sum > 100)
                break;
            ++i;
            sum += 1;

        }
        System.out.printf("i=%d, sum=%d", i, sum);
    }

}
