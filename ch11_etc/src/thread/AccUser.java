package thread;

public class AccUser implements Runnable {
    private Account ac = new Account();

    @Override
    public void run() {
        while (ac.getBal() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            ac.withdraw(money);
            System.out.println("bal :" + ac.getBal());
        }

    }
}
