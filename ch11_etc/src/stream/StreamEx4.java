package stream;

import java.io.File;
<<<<<<< HEAD
import java.util.*;
import java.util.stream.Collectors;
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
<<<<<<< HEAD
        List<String> names = Arrays.asList("홍", "김", "신", "박", "홍");

        // 중복 제거 후 출력
        // 1) Set
        Set<String> set = new HashSet<>(names);
        System.out.println(set);
        // 2) Stream
        names.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        // 신씨 성 가진 사람만 출력
        names.stream()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        // 중복 제거 후 신 씨 성을 가진 사람을 출력
=======
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신민철", "홍길동");

        // 중복 제거 후 출력
        // 1) Set 2) Stream
        Set<String> set = new HashSet<>(names);
        System.out.println(set);

        names.stream().distinct().forEach(n -> System.out.println(n));

        // 신씨 성 가진 사람 출력
        names.stream()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));

        // 중복제거 후 신씨 성 가진 사람 출력
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
        names.stream()
                .distinct()
                .filter(name -> name.startsWith("신"))
                .forEach(n -> System.out.println(n));
<<<<<<< HEAD
        System.out.println();
=======
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7

        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");
        // 대문자로 변경 후 출력
        for (String f : fruits) {
            System.out.println(f.toUpperCase());
        }
<<<<<<< HEAD

        // 대문자 변경 후 새로운 리스트로 생성
        List<String> list1 = new ArrayList<>(); // 새로운 리스트 생성
        for (String fruit : fruits) {
            list1.add(fruit.toUpperCase()); // 대문자로 변환 후 추가
        }
        System.out.println(list1);

        // Stream 으로 대문자 변경 후 새로운 리스트로 생성
        List<String> list2 = fruits.stream()
                .map(f -> f.toUpperCase()) // 대문자로 변환
                // .map(String::toUpperCase) // 대문자로 변환 > ::(더블콜론)은 메서드 참조 역할로 람다식을 좀 더 간결하게 표현
                .collect(Collectors.toList()); // 새로운 리스트 생성
        System.out.println(list2);

        // Stream 생성
        // IntStream.range()
        // of(T...values) : 갯수가 정해져 있지 않은 가변
        // of(T t) : 하나만 가능
=======
        // 대문자 변경 후 새로운 리스트로 생성
        List<String> list1 = new ArrayList<>();
        for (String f : fruits) {
            list1.add(f.toUpperCase());
        }
        System.out.println(list1);

        // Stream 이용
        // Function<String, ? extends Object> mapper
        List<String> list2 = fruits.stream()
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());

        // Stream 생성
        // IntStream.range(0, 0)
        // of(T... values) : 가변
        // of(T t)
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
        Stream<File> stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
<<<<<<< HEAD
       
     // 확장자를 출력(중복된 확장자는 제외)
        // 데이터를 저장해 재사용 하고 싶다면 이 코드 but 동기화 문제 발생 가능
        Set<String> extSet = new HashSet<>();
       stream.forEach(f -> {
            
            int pos = f.getName().indexOf("."); // "." 포함 된 파일만 필터링
            if (pos != -1) {
                String ext = f.getName().substring(pos+1); //확장자 추출
                extSet.add(ext); //추출값 변수에 저장
            }
       });
       System.out.println(extSet); // 저장된 값 출력 

       // 한번만 확장자를 출력하면 되는 경우 or 병렬 처리를 고려할 경우
       stream.map(f -> f.getName()) // 파일 이름 가져오기 
       .filter(f -> f.indexOf(".")  > -1) // "." 포함 된 파일만 필터링
       .map(f -> f.substring(f.lastIndexOf(".") +1)) // 확장자 추출
       .distinct() // 중복 제거 
       .forEach(f -> System.out.println(f)); //출력
=======
        // 확장자를 출력(중복된 확장자는 제외) - txt, bak, java

        // 추출된 확장자 담기
        Set<String> extSet = new HashSet<>();
        stream.forEach(f -> {
            // 확장자 추출
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                extSet.add(ext);
            }
        });
        System.out.println(extSet);

        // stream
        stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));
        stream.map(f -> f.getName()) // ["file1.txt","file2.txt"...]
                .filter(f -> f.indexOf(".") > -1) // "file1.txt","file2.txt","file4.bak","file5.java"
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // txt, txt, bak, java
                .distinct() // txt, bak, java
                .forEach(f -> System.out.println(f));

>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
    }
}
