import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {
    public static void main(String[] args) {
        // 스택과 큐 모두 사용 가능 
        // 큐는 원래 방식과 같음
        
        // Stack<Integer> 의 스택 : push가 Vector의 add()를 호출함(맨 뒤에 추가 됨) [10<20<30]
                                  // 마지막 추가 된 값이 맨 뒤에 위치함 
        // Deque<Integer> 의 스택 : push가 addFirst()를 호출함(맨 앞에 추가 됨) [30>20>10]
                                  // 마지막 추가 된 값이 맨 앞에 위치함

        // Deque<Integer> 에서 Stack 처럼 사용하기 : add(push)대신 addLast()를 호출 [10,20,30]
        
        
        
        Deque<Integer> stack = new ArrayDeque<>();

        // Stack처럼 push (맨 위에 요소 추가 = 마지막 추가 된 요소가 처음 시작 부분에 위치함)
        // push = addFirst(); => [30,20,10] , push = addLast(); => [10,20,30]
        stack.push(10); 
        stack.push(20);
        stack.push(30);

        System.out.println("스택: " + stack); // [30, 20, 10] (LIFO)

        // Stack처럼 pop (맨 위 요소 제거)
        System.out.println("pop: " + stack.pop()); // 30
        System.out.println("pop 후 스택: " + stack); // [20, 10]

        // Stack처럼 peek (맨 위 요소 확인)
        System.out.println("peek: " + stack.peek()); // 20


    }
}
