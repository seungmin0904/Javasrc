package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// 추상클래스 : 클래스 + 추상메서드 , 직접 객체 생성 불가, 부모역할

// 입력장치에서 읽어오기

public class IntputStreamEx1 {
   public static void main(String[] args) {
      // ~~~Stream : 입력값 byte 형태로 처리
      InputStream in = System.in;
      OutputStream out = System.out;
      try {
         // read() : 한바이트만 읽어서 int로 돌려줌
         // int input = in.read(); // abc를 입력
         // out.write(input); // a가 반환됨
         // int input = 0;
         // while ((input = in.read()) != -1) {
         // out.write(input);
         // }
         byte[] b = new byte[1024];
         while ((in.read(b)) != -1) {
            out.write(b);
         }

      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            in.close();
            out.close();

         } catch (IOException e) {

            e.printStackTrace();
         }

      }

   }
}
