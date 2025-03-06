package oop;

// 객체 생성(new) 개수를 1개로 제한하는 방법 
public class Singleton {
    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {

    }

    static Singleton getInstance() {
        return singleton;
    }

}
