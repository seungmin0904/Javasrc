package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력받아서 그 내용을 파일에 작성하는 프로그램
        // 사용자가 q를 입력하면 입력 중지

        // Integer.parseInt(sc.nextLine());
        System.out.println("데이터 입력");
        System.out.println("중지는 q");

        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter br = new BufferedWriter(fw)) {
            String data = "";

            do {
                System.out.println(">> ");
                data = sc.nextLine();

                if (!data.equals("q")) {

                    br.write(data);
                    br.newLine();
                }
            } while (!data.equals("q"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
