package generics;

public class Box2<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// class BoxEX {
// public static void main(String[] args) {
// Box2<String> box = new Box2<>();
// box.setItem("자바");

// String result = box.getItem();

// Box2<Integer> box2 = new Box2<>();
// box2.setItem(1);
// int i = box2.getItem();

// }
// }