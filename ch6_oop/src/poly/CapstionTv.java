package poly;

public class CapstionTv extends Tv2 {
    boolean caption;

    void displaycaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
