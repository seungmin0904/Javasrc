package ch2;

public class SamsungTv implements Tv {
    @Override
    public void powerOn() {
        System.out.println("파워 on");

    }

    @Override
    public void powerOff() {
        System.out.println("파워 off");

    }

    @Override
    public void volumeUp() {
        System.out.println("볼륨 Up");

    }

    @Override
    public void volumeDown() {
        System.out.println("볼륨 Down");

    }
}
