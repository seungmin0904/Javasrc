package oop;

import java.time.LocalDate;

public class product {
    // 속성
    // 제품번호 , 제품명, 가격, 제조 년월
    String code;
    String name;
    int price;
    LocalDate regidate; // LocalDate 날짜
    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 하나(default) 생성자 만들어준다
    // product(){}

    // 기능 = 가격 변경
    void changePrice() {

    }

    @Override
    public String toString() {
        return "product [code=" + code + ", name=" + name + ", price=" + price + ", regidate=" + regidate + "]";

    }

}
