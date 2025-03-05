package oop;

public class student {
    // 멤버 변수, 멤버 메소드, 생성자,

    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-56),
    // 이메일(hong2@gmail.com)
    String stuId;
    String name;
    int grade;
    int classNum;
    String phone;
    String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 하나(default) 생성자 만들어준다
    // 클래스명(){}
    // 기본 생성자
    // constructor 사용으로 여러가지 클래스를 만들때는 클래스명 괄호 안에 개수가 달라야 함
    public student() { // default 생성자
    }

    // 생성자의 목적은 멤버 변수 초기화
    public student(String stuId, String name, int grade, int classNum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    // int grade, int classNum 전달인자(일반변수)
    public student(int grade, int classNum) {
        this.grade = grade; // this 내꺼 바꿔줘
        this.classNum = classNum;
    }

    // 기능 : 전화번호 변경 , 이메일 변경 , 학년 변경 , 반 변경
    // 메소드 : 리턴 타입, 메소드명 (){}
    // 리턴(반환) 타입: 기본타입(int , String , boolean , double), 객체(대문자로 시작), 배열, void(리턴타입
    // 없음)
    void changeTel(String phone) {
        // this : 멤버 변수 앞, 멤버 메소드 앞 지금 가지고있는 값을 새로 들어오는 값으로 변경
        this.phone = phone;
    }

    void changeEmail(String email) {
        this.email = email;
    }

    void changeGrade(int grade) {
        this.grade = grade;
    }

    void changeClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}
