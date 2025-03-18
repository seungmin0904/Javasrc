package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEX2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/img1.JPG");
            fos = new FileOutputStream("c:/temp/output1.JPG");
            long start = System.currentTimeMillis();
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                // System.out.println(ch);
                fos.write(ch);
            }
            long end = System.currentTimeMillis();
            System.out.println("걸린시간" + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
