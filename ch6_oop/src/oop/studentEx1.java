package oop;

public class studentEx1 {
    public static void main(String[] args) {
        // Student 인스턴트 생성, 사용
        // 인스턴스 생성 시 생성자 사용함
        student student1 = new student();
        student student2 = new student(1, 5);
        student student3 = new student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong2@gmail.com");
        student student4 = new student("s12345678", "강길동", 1, 1, "010-1234-5679", "kang2@gmail.com");

        // 개발자 확인용
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);

        studentInfo(student3);
        // System.out.println("============================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("============================");

        System.out.println();
        studentInfo(student4);
        // System.out.println("============================");
        // System.out.println("아이디 : " + student4.getStuId());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNum());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("============================");

        // 홍길동 전화번호 변경
        student3.changeTel("010-5978-1234");
        System.out.println(student3);
    }

    public static void studentInfo(student student) {
        System.out.println("============================");
        System.out.println("아이디 : " + student.getStuId());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNum());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("============================");
    }
}
