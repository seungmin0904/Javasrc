package ch2;

// LgTv 변수 초기화
// 1 ) 생성자
// 2 ) setter
public class LgTv implements Tv {

    private Speaker speaker;

    public LgTv() {

    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void powerOn() {
        System.out.println("LG 파워 on");
    }

    @Override
    public void powerOff() {

        System.out.println("LG 파워 off");
    }

    @Override
    public void volumeUp() {

        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {

        speaker.volumeDown();
    }
}
