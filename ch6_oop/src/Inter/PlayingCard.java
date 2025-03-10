package Inter;

public interface PlayingCard {

    // 멤버변수 가질 수 없음
    // 상수의 형태로만 가질 수 있음
    // boolean pause; (X)

    // 상수(대문자로 선언)
    public static final int SPADE = 4;
    // public static final 생략 가능
    int CLOVER = 1;

    // 일반 메서드 가질 수 없음
    // void pause(){} (X)

    // 추상 메서드만 가진다
    // public abstract 생략 가능
    void pause();

    // static, default가 붙는다면 일반 메소드(중괄호가 있는)도 허용함
    static void display() {
    }

    default void print() {
    }
}
