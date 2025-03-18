package generics;

class FruitBox<T extends Fruit> extends Box3<T> {
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.geList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class Juice {
    String name;

    Juice(String name) {
        this.name = name + " Juice";

    }

    @Override
    public String toString() {

        return name;
    }
}
