package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    // 주소비교 > 값비교로 변환
    // 멤버 변수 value 의 값이 같은 값인지 비교
    @Override
    public boolean equals(Object obj) {

        Value v = (Value) obj;

        return this.value == v.value;

    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    // toString의 사용 형태 : 멤버변수의 값을 출력하는 용도로 많이 사용
    // 벨류(int)를 String으로 변환하는 방법
    // @Override
    // public String toString() {

    // return value + "";
    // }

}
