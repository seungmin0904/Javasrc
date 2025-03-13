import java.util.Stack;

public class ExStack {
    public static void main(String[] args) {
        // 기본 개념은 후입선출 
        // pop() : 마지막에 추가한 요소 제거  
        // 10 20 30 이렇게 들어갔으면 pop() = 30
        // peek() : 최상단(마지막에들어온) 요소 확인
        // 오른쪽부터 밀리면서 채워짐 addLast() > [10,20,30]
        
        Stack<Integer> stack = new Stack<>();
        // 요소 추가(push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("초기 스택 :" + stack); // [10,20,30]
        
        // 요소 확인 (peek) : 스택의 맨 위 요소 확인(제거 안함)
        System.out.println("맨 위 요소 확인 : " + stack.peek()); //30

        // 특정 위치 요소 확인 : 지정한 인덱스의 요소 반환
        System.out.println("0번 인덱스의 요소 : " + stack.elementAt(0)); //10
        
        // 특정 위치 요소 변경 : 지정한 인덱스의 요소 변경
        stack.set(1, 25);
        System.out.println("1번 인덱스 변경 후 스택 : " + stack); //[10,25,30]

        // 특정 위치에 요소 삽입 : 지정한 인덱스에 요소 삽입
        stack.insertElementAt(15, 1);
        System.out.println("1번 인덱스에 삽입 후 스택 : " + stack); // [10,15,25,30]

        // 요소 제거 (pop) : 최상단(마지막 삽입된) 요소 제거
        System.out.println("제거 된 요소 : " + stack.pop()); // 30
        
        // 특정 위치 요소 제거 : 지정한 인덱스의 요소 제거 
        stack.remove(1);
        System.out.println("1번 인덱스 제거 후 스택 : " + stack); // [10,25]

        // 비어있는지 확인 : 비어있으면 true 아니면 false
        System.out.println("스택이 비어있는가? : " + stack.isEmpty()); // false
        
        // 한줄씩 출력하고 싶을때는 for - each문 사용 
        for (Integer integer : stack) {
            System.out.println(stack.pop());
            System.out.println(integer);
        }
        
        // 역순으로 출력 하고 싶을때(마지막 삽입 된 요소부터 출력 하고 싶을때) while 문 사용
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        } 

    }
}
