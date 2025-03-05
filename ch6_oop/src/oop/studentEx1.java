package oop;

public class studentEx1 {
    public static void main(String[] args) {
        // Student 인스턴트 생성, 사용
        // 인스턴스 생성 시 생성자 사용함
        student student1 = new student();
        student student2 = new student(1, 5);
        student student3 = new student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong2@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // 홍길동 전화번호 변경
        student3.changeTel("010-5978-1234");
        System.out.println(student3);
    }
}
