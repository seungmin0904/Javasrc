package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream 사용
        // 2) Scanner 사용

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력"); // 숫자만 가져가고 엔터가 남음
        int num1 = sc.nextInt();
        System.out.println("연산자 입력 ");
        // String op = sc.nextLine(); // 남은 엔터가 선행되어서 입력이 건너뛰어짐
        String op = sc.next(); // 엔터를 안읽음
        System.out.println("숫자");
        int num2 = sc.nextInt();

    }
}
