package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();
        // child1.method1();
        // child1.method2();
        // child1.method3();

        // 접근범위
        // parent.field1;
        parent.method1();
        parent.method2();

        // method3 사용하려면 강제 형변환이 필요함
        // 부모 = 자식
        // 생성 된 new 가 자식이어야 강제 형변환 가능
        Child child2 = (Child) parent;
        child2.method3();

        // 아래와 같은 경우는 불가
        Parent parent2 = new Parent();
        child2 = (Child) parent2;
        child2.method3();
    }
}
