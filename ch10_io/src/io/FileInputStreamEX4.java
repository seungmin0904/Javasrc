package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEX4 {
    public static void main(String[] args) {

        int data = 0;
        byte b[] = new byte[1024];
        // try-with-resource : FINALLY에서 자원 해제 하는 부분 자동화
        try (FileInputStream fis = new FileInputStream("c:/temp/img1.JPG");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.JPG");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while ((data = fis.read(b)) != -1) {

                fos.write(b);
            }
            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
