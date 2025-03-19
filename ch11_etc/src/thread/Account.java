package thread;

public class Account {
    private int bal = 1000;

    public int getBal() {
        return bal;
    }
    // synchronized 동기화 메소드 사용해서 임계영역 지정
    // public synchronized void withdraw(int money) {
    // if (bal >= money) {
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {

    // }
    // bal -= money;
    // }
    // }

    // 동기화 블럭 synchronized(this){임계영역 지정할 영역}
    public void withdraw(int money) {

        synchronized (this) {

            if (bal >= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                bal -= money;
            }
        }
    }
}
