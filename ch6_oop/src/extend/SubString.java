package extend;

// 오버라이딩
// 상속관계에서만 가능
// 조건
// - 이름이 같아야 함
// - 매개 변수가 같아야 함
// - 반환 타입이 같아야 함

// 재정의: 부모가 정의 해준 내용을 자식에 맞춰서 변경하는 개념

// 오버로딩(overloading) vs 오버라이딩(overriding)
// 오버라이딩 : 상속, 상속받은 메서드의 내용을 변경하는 것
// 오버로딩 : 하나의 클래스에서 동일 메서드를 여러개 정의하는 것

public class SubString extends ListString {
    String name = "성춘향";

    @Override
    public void list() {
        // 부모의 list 호출
        super.list(); // 내 이름만 나오게 하고 싶으면 부모 list 호출을 주석처리
        System.out.println(name + " 하위 클래스 이름 ");
    }

    public void print() {
        list(); // 본인
        super.list(); // 부모의 list 를 부르고 싶으면 super를 붙임
        exec(); // super. 자식(클래스)이랑 부모(클래스)가 같은 내용일때 자식 클래스 내부에서 변경을 원하는 경우에 서로 구별하는 용도로 쓰임
    }

}
