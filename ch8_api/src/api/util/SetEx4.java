package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lot = new TreeSet<>();

        for (int i = 0; lot.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lot.add(num);
        }
        System.out.println("Treeset :" + lot);
    }
}
