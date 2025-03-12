package exception;

public class ArrayEx {
    public static void main(String[] args) {
        // int arr[] = new int[2];
        //
        // try {
        // System.out.println(arr[0]);
        // int num = 100 / 0;

        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열 인덱스 확인");
        // } catch (ArithmeticException e) {
        // System.out.println("0 으로 나눌 수 없다");
        // }

        int arr[] = new int[2];
        // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        try {
            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException:
            int num = 100 / 0; // ArithmeticException:

        } catch (Exception e) { // 부모 소환
            System.out.println("오류 발생 관리자에게 문의");

        }

        try {
            System.out.println(arr[0]); // ArrayIndexOutOfBoundsException:
            int num = 100 / 0; // ArithmeticException:

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // 지정 소환
            System.out.println("오류 발생 관리자에게 문의");

        }
    }
}
