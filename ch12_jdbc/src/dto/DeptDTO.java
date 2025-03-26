package dto;
// ~~ DTO : data transfer object - 메소드에 데이터를 담아서 전달하는 객체

// ~~ DAO : data access object - DB 작업을 모아놓은 객체 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DeptDTO {
    private int deptno;
    private String dname;
    private String loc;
}
