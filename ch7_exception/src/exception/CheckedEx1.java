package exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        // 빨간 줄 나오는 문장(컴파일에러)을 넣어서 확인
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {

            // 예외의 발생 원인 보기
            e.printStackTrace();
        }

    }
}
