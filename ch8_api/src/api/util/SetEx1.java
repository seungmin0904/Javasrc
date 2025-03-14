package api.util;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("사과");
        set.add("바나나");
        set.add("귤");
        set.add("포도");
        set.add("오렌지");
        set.add("감");
        set.add("사과");
        set.add("수박");

        System.out.println(set);

        String str = "사과";
        String str1 = "사과";
        String str2 = new String("사과");
        System.out.println("str" + str.hashCode());
        System.out.println("str1" + str1.hashCode());
        System.out.println("str2" + str2.hashCode());

    }
}
