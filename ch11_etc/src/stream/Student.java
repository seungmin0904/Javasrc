package stream;

<<<<<<< HEAD

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter 
@AllArgsConstructor

=======
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
public class Student {
    private String name;
    private int math;

<<<<<<< HEAD
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
=======
    // public String getName() {
    // return name;
    // }

    // public int getMath() {
    // return math;
    // }

    // public Student(String name, int math) {
    // this.name = name;
    // this.math = math;
    // }

    @Override
    public String toString() {
        return "Student [name=" + name + ", math=" + math + "]";
    }
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7

}
