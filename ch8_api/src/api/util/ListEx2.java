package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 요소 추가
        list.add("사과");
        list.add("바나나");
        list.add("귤");
        list.add("포도");
        list.add("오렌지");
        list.add("감");
        list.add("수박");

        System.out.println("index 를 이용한 제거" + list.remove(1));
        System.out.println("직접 제거" + list.remove("감"));

        // for 문으로 확인 for e가 간편함
        // 배열에서는 length 사용 , list는 size(); 사용
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s\t", list.get(i));
        }
        System.out.println();

        for (String str : list) {
            System.out.printf("%s\t", str);
        }
        System.out.println();

        // 전체 배열안에 특정 단어가 있는지 여부를 boolean으로 반환함
        System.out.println("특정단어 포함 여부 " + list.contains("키위"));
        // 전체 배열안에 특정 단어가 있는 위치를 index로 반환함
        System.out.println("특정단어 포함된 위치 " + list.indexOf("수박"));

        // int[] arr = {}
        // 배열 => 리스트 변환(조회용 , 변경 불가)
        // Arrays : 배열에 필요한 유용한 메소드 제공
        String strArr[] = { "사과", "포도", "멜론", "수박", "참외", "바나나", "자두" };
        List<String> list2 = Arrays.asList(strArr);
        System.out.println("조회" + list2.get(3));

        //// 배열 => 리스트 변환(조회 + 변경)
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);

        System.out.println(list3);

        // 리스트 => 배열
        Object[] arr = list3.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
