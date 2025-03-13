package api.util;

import java.util.ArrayList;

import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // 리스트는 배열
        // int
        List<Integer> list = new ArrayList<>(); // 기본 공간 10개

        // 추가
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(4, 65); // 위치 지정해서 넣음

        System.out.println(list);

        // 조회
        // arr[3]
        System.out.println("특정위치 요소를 조회하려면 : " + list.get(3));
        System.out.println("특정위치 요소를 제거하려면 : " + list.remove(0));
        System.out.println("특정 요소를 제거하려면 : " + list.remove(Integer.valueOf(35)));

        System.out.println(list);

    }
}
