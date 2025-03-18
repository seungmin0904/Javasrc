package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {
    public static void main(String[] args) {
        // 문자 기반으로 읽어오기 : char[]
        // 읽기
        // Reader reader = null;
        // // 쓰기
        // Writer writer = null;

        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("UTF-8"));
                Writer writer = new FileWriter("c:/temp/output2.txt", true)) {
            int data = 0;
            char cbuf[] = new char[1024];
            while ((data = reader.read(cbuf)) != -1) {
                // System.out.println(cbuf);
                writer.write(cbuf);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
