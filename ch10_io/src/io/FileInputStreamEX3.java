package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEX3 {
    public static void main(String[] args) {

        int data = 0;
        byte b[] = new byte[1024];
        try (FileInputStream fis = new FileInputStream("c:/temp/img1.JPG");
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.JPG");) {

            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {

                fos.write(b);
            }
            long end = System.currentTimeMillis();
            System.out.println("걸린시간" + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
