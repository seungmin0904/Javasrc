package stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {

    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcdef"); //
        Optional<Integer> optInt = optStr.map(String::length); //

        // Optional에 들어있는 값을 가져오려면 변수 + get();
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());
        System.out.println();

        // orElse() 값이null일때 빈 문자열 반환
        // optStr.orElse("");
        int result = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);
        System.out.println("resulr " + result);
        System.out.println();

        // isPresent() / ifPresent()
        Optional.of("456")
                .map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result = %d\n", x));

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println("optIn1 =" + optInt1.isPresent());
        System.out.println("optIn2 =" + optInt2.isPresent());

    }

}
