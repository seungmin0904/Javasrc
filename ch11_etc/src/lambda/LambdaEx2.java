package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t)
        // 타입을 하나를 지정해 전달인자로 받아 출력
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(50);
        // 문자를 전달인자로 받아 출력
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("qqq");
        // 2가지 객체타입을 전달인자로 받아 출력
        BiConsumer<Integer, String> biConsumer = (str2, str3) -> System.out.println(str2 + str3);
        biConsumer.accept(50, " - 50 = 0");
        // double타입을 전달인자로 받아 출력
        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(1.5);
        // 숫자만 전달인자로 받아 출력
        IntConsumer intConsumer = (i) -> System.out.println(i);
        intConsumer.accept(24);
        // 지정된 객체타입과 더블타입 값을 전달인자로 받아 출력
        ObjDoubleConsumer<String> objDoubleConsumer = (str, d) -> System.out.println(str + "" + d);
        objDoubleConsumer.accept("asd  ", 1.232352);
        // Math.Random 을이용해 1~6을 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier.get());

        IntSupplier supplier2 = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier2.getAsInt());
    }
}
