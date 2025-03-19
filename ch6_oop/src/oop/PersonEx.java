package oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("asd");
        p1.setPno("123");
        p1.setTel("123-123-123");
        System.out.println(p1);

        Person p = new Person(null, null, null);

        Person2 p2 = new Person2();
        p2 = new Person2(null);

        Person2 person2 = Person2.builder().pno("456").name("ㅁㄴㅇ").tel("010").build();
        System.out.println(person2);
    }
}
