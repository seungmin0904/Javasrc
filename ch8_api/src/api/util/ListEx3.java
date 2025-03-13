package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        // person 객체를 List에 담기
        List<Person> list = new ArrayList<>();
        list.add(new Person("hong", "홍길동")); // Person [id=hong, name=홍길동]
        list.add(new Person("kang", "강길동"));
        list.add(new Person("kim", "김길동"));
        list.add(new Person("park", "박길동"));
        list.add(new Person("lee", "이길동"));

        for (Person person : list) {
            System.out.println(person); // person.toString()
        }
        // 아이디 이름
        // --------------------
        // hong 홍길동
        // 만드려면

        System.out.println("아이디\t 이름");
        System.out.println("-------------------");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }
    }
}
