package Inter;

public interface RemoteControl {
    // 상수(fical static 생략가능) , 추상메서드(abstract) , default , static
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // public abstract 생략가능
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리.");
        } else {
            System.out.println("무음 해제.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교환");
    }

}
