package thread;

public class UserEx {
    // user 1 user 2
    public static void main(String[] args) {
        Calc calc = new Calc();
        Thread t1 = new User1(calc);
        Thread t2 = new User2(calc);

        t1.start();
        t2.start();

    }
}
