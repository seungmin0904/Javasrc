package extend;

public class CapstionTv extends Tv {
    boolean caption;

    void displaycaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
