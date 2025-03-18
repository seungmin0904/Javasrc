package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit {
    @Override
    public String toString() {

        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {

        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {

        return "Grape";
    }
}

class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    public ArrayList<T> geList() {
        return list;
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {

        return list.toString();
    }
}

class Toy {
    @Override
    public String toString() {

        return "Toy";
    }
}

public class FruitBoxEx1 {

    Comparator c;

    public static void main(String[] args) {
        Box3<Fruit> fru = new Box3();
        Box3<Apple> apl = new Box3();
        Box3<Toy> toy = new Box3();
        Box3<Grape> gra = new Box3();

        // 상속 관계시 부모 타입으로 지네릭스를 선언하면 모든 자식을 담을 수 있다.
        fru.add(new Fruit());
        fru.add(new Apple());

        // apl.add(new Fruit()); (X)
        toy.add(new Toy());

        // sort 대상 리스트, Comparator<? super T> c
        // <? super Apple> : Apple 클래스 + 부모(Fruit,Object)
        List<Apple> list = new ArrayList<>();
        Collections.sort(list, null);

    }
}
