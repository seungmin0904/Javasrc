package thread;

public class AccountEx {
    public static void main(String[] args) {
        AccUser ac = new AccUser();
        Thread t1 = new Thread(ac);
        Thread t2 = new Thread(ac);

        t1.start();
        t2.start();

    }
}
