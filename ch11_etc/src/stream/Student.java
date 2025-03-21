package stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor


public class Student {
    private String name;
    private int math;

    public String getName() {
        return name;
    }
    public int getMath() {
        return math;
    }

    
 @Override
 public String toString() {
    
     return "student [name= " + name + ", math="  + math+ "]";
 }

}
