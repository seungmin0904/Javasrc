package emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder

public class EmpDTO {
    // 테이블의 한 행과 똑같은 구조로 생성
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hireDate;
    private int sal;
    private int comm;
    private int deptNo;

}
