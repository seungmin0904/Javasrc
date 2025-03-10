package abstractclass;

public class PlayerEx {
    public static void main(String[] args) {
        // 인스턴스 생성 불가
        // Player player = new Player();

        Player player = new CDPlayer();
        player.Play();
        player = new AudioPlayer();
        player.Play();
    }
}
