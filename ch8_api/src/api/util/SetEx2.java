package api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 로또 번호 1 ~ 45
        // 6개의 숫자를 무작위로 추출

        Set<Integer> lot = new HashSet<>();
        for (int i = 0; lot.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lot.add(num);
        }
        System.out.println("Hashset :" + lot);

        // Set > List 변경
        List<Integer> list = new ArrayList<>(lot);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        // System.out.println(Comparator.reverseOrder()); // reverseOrder() 내림차 순
        // System.out.println(Comparator.naturalOrder()); // naturalOrder() 오름차 순

    }
}
