package ch2;

public class TvEx {
    public static void main(String[] args) {
        // Tv tv = new LgTv(new BritzSpeaker())
        LgTv tv = new LgTv();
        Speaker speaker = new BritzSpeaker();
        tv.setSpeaker(speaker);
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
