package ch2;

public class BritzSpeaker implements Speaker {
    public static void main(String[] args) {

    }

    @Override
    public void volumeUp() {
        System.out.println("Britz volumUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("Britz volumDown");
    }
}