package api.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterratorEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "배", "수박", "포도");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        Set<String> set = new HashSet<>(list);

        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
