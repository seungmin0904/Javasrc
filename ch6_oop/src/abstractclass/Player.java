package abstractclass;

public abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    // 추상메서드
    abstract void Play();

    void pause() {

    }
}

class CDPlayer extends Player {

    @Override
    void Play() {
        System.out.println("CD플레이어");

    }

}

class AudioPlayer extends Player {

    @Override
    void Play() {
        System.out.println("Audio플레이어");
    }
}