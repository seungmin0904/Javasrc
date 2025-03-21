package stream;

<<<<<<< HEAD

public class Member {
    
    public static int MALE = 0;
    public static int FEMALE =1;
    
    private String name;
    private int gender;
    private int age;
    
    public int getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
=======
public class Member {

    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int gender;
    private int age;

>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
<<<<<<< HEAD
    
    
=======

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
>>>>>>> 30f1daa826d99713bc0f6cffa5315016d7221de7
}
