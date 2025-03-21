package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t)
        // 타입을 하나를 지정해 전달인자로 받아 출력
        Consumer<Integer> consumer = (i) -> System.out.println(i);
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

        
        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0인 경우 빈문자열입니다 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test(""))
            System.out.println("빈 문자열입니다.");

        // 전달인자로 받은 숫자가 짝수인지 테스트한 후 짝수라면 짝수입니다. 아닌경우 홀수입니다.
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        if (predicate2.test(5)) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }

        // T : type, r : return type
        // 숫자를 문자로 반환
        Function<Integer, String> f = (i) -> String.valueOf(i);
        System.out.println(f.apply(35));

        // 사칙연산 숫자 2개를 받아서 숫자 1개로 반환(자동연산)
        BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
        System.out.println(f2.apply(5, 4));

        f2 = (x, y) -> x * y;
        System.out.println(f2.apply(5, 4));

        f2 = (x, y) -> x - y;
        System.out.println(f2.apply(5, 4));
    }
}
