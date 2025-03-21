package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
    public static void main(String[] args) {
<<<<<<< HEAD
        
         IntStream stream = IntStream.rangeClosed(1, 10);
=======
        IntStream stream = IntStream.rangeClosed(1, 10);
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
        // 2의 배수 개수
        Long cnt = stream.filter(i -> i % 2 == 0).count();
        System.out.println("배수 갯수 : " + cnt);

        IntStream stream2 = IntStream.rangeClosed(1, 10);
        OptionalDouble dou = stream2.filter(i -> i % 2 == 0).average();
        System.out.println("배수 개수의 평균 :" + dou);

        IntStream stream3 = IntStream.rangeClosed(1, 10);
        OptionalInt dou2 = stream3.filter(i -> i % 2 == 0).max();
        System.out.println("배수의 최대값 :" + dou2);

        IntStream stream4 = IntStream.rangeClosed(1, 10);
        OptionalInt dou3 = stream4.filter(i -> i % 2 == 0).min();
        System.out.println("배수의 최소값 :" + dou3);

        IntStream stream5 = IntStream.rangeClosed(1, 10);
        int dou4 = stream5.filter(i -> i % 2 == 0).sum();
        System.out.println("배수의 합 :" + dou4);
<<<<<<< HEAD
=======

>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
    }
}
