package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "456", "789");

        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();
        
        // Iterator (외부 반복자 : 사용자의 직접 지정을 통해 반복문을 설정 후 출력)
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();

        // Stream 
        Stream<String> stream=list.stream();

        // Consumer<String> action;
        // forEach(Consumer<? super String> action) : void
        // 내부 반복자(내부적으로 반복문을 돌리게 한 뒤 출력문만 설정 후 출력)
        stream.forEach(s -> System.out.println(s));
        
        List<Student> students = Arrays.asList(
            new Student("123", 90),
            new Student("456", 75));

           Stream<Student> stream2 = students.stream();
           stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);
           });
           students.stream()
           .forEach(stu ->  System.out.println(stu));
    }
}
