package oop;

public class SingletonEx1 {
    public static void main(String[] args) {
        // Singleton singleton = new
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체");

        student student1 = new student();
        student student2 = new student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체");

    }
}
