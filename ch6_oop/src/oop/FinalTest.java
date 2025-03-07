package oop;

// public final class FinalTest {

// }

public class FinalTest {
    final int MAX_SIZE = 10;

    void getMaxSize() {
        // MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // LV = 20;
    }
}

class Test extends FinalTest {

}
