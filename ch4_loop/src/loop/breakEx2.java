package loop;

public class breakEx2 {
    public static void main(String[] args) {
        // 주사위 눈이 6이 나올때까지 주사위 굴리기
        // break + if 형태를 주로 사용

        int num = 0;

        while (true) {
            // if 에서 실행 할 구문이 하나 인 경우 {} 생략가능 , 가급적 사용
            // sum 값이 100보다 큰경우 break
            num = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위 : %d\n", num);

            if (num == 6) {
                break;
            }

        }

    }

}
