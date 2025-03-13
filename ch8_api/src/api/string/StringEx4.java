package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        // String result = obj.findKim(names);
        // System.out.println(result);
        List<String> list3 = new ArrayList<>(Arrays.asList(names));
        System.out.println(list3.indexOf("Kim"));
        System.out.printf("kim은 %d 번에 있다", (list3.indexOf("Kim")));
    }
}
// public String findKim(String[] seoul) {
// // 반환 : "kim은 3번째에 있다"
// int i = 0;
// for (; i < seoul.length; i++) {
// if (seoul[i].equals("Kim")) {
// break;
// }
// }
// return "Kim은 " + (i + 1) + "번째에 있다";
// }
// }
