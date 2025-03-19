package oop;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter // 모든 멤버 변수의 setter 메소드 작성

public class Person {
    private String pno;
    private String name;
    private String tel;

}
