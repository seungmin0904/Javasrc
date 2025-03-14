package api.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(2000000);
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("===순차적으로 추가===");
        System.out.println("Array " + add1(arrayList));
        System.out.println("Linked " + add1(linkedList));
        System.out.println();
        System.out.println("===중간에 추가===");
        System.out.println("Array " + add2(arrayList));
        System.out.println("Linked " + add2(linkedList));
        System.out.println();
        System.out.println("===중간에삭제===");
        System.out.println("Array " + remove2(arrayList));
        System.out.println("Linked " + remove2(linkedList));
        System.out.println();
        System.out.println("===순차적으로 삭제===");
        System.out.println("Array " + remove1(arrayList));
        System.out.println("Linked " + remove1(linkedList));
        System.out.println();

    }

    public static long add1(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(500 + "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
