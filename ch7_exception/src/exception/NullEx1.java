package exception;

public class NullEx1 {
    public static void main(String[] args) {
        // NullPointerException:
        //
        String str = null;
        // System.out.println(str.length());

        Account accounts[] = new Account[5];
        // null 확인 후 처리하기
        for (Account account : accounts) {
            if (account != null)
                System.out.println(account.getAno());
        }

        try {
            // if 사용 안하면 null 포인터가 발생할 때 처리 필요
        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("입력을 확인해주세요");

        }
    }
}
