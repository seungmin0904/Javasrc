package api.util;

import java.util.HashSet;

import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {
        // person 객체를 List에 담기
        Set<Person> set = new HashSet<>();
        set.add(new Person("hong", "홍길동")); // Person [id=hong, name=홍길동]
        set.add(new Person("kang", "강길동"));
        set.add(new Person("kim", "김길동"));
        set.add(new Person("hong", "홍길동"));
        set.add(new Person("lee", "이길동"));

        for (Person person : set) {
            System.out.println(person); // person.toString()
        }
        System.out.println(new Person("hong", "홍길동").hashCode());
        System.out.println(new Person("hong", "홍길동").hashCode());
    }
}
