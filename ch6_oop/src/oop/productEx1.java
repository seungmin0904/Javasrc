package oop;

import java.time.LocalDate;

public class productEx1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        // 생성자 호출
        product product1 = new product();

        // 이후 초기화 작업을 한번 해준다 : 세팅값 설정
        product1.code = "p10214";
        product1.name = "운동화";
        product1.price = 124000;
        product1.regidate = LocalDate.now();

        System.out.println(product1);

    }
}
