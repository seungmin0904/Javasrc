import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 요소 추가 (offer) : 큐의 맨 뒤에 요소 추가 
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("초기 큐: " + queue);  // [10, 20, 30]

        // 요소 확인 (peek) : 큐의 맨 앞 요소 확인(제거 안함)
        System.out.println("맨 앞 요소 확인: " + queue.peek());  // 10

        // 요소 제거 (poll) : 큐의 맨 앞 요소 제거 후 반환
        System.out.println("제거된 요소: " + queue.poll());  // 10
        System.out.println("poll 후 큐: " + queue);  // [20, 30]

        // 특정 위치 요소 확인 (LinkedList 활용) : 지정 된 인덱스의 요소 반환
        LinkedList<Integer> list = (LinkedList<Integer>) queue; // Linked List 선언

        System.out.println("1번 인덱스 요소 확인: " + list.get(1));  // 30

        // 특정 위치 요소 변경 (LinkedList 활용) : 지정 된 인덱스의 요소 변경
        System.out.println("1번 인덱스 변경 후 큐: " + list.set(1, 35));  // [20, 35]

        // 특정 위치에 요소 삽입 (LinkedList 활용) : 지정 된 인덱스에 요소 삽임
        // stack, Quere 모두 특정 위치에 요소를 삽입하면 기존 요소 들은 뒤로 밀림 
        list.add(1, 25); // 반환 타입이 void면(add) println 안에 삽입 출력이 불가
        System.out.println("1번 인덱스에 삽입 후 큐: " + list);  // [20,35] > [20, 25, 35]

        // 특정 위치 요소 제거 (LinkedList 활용) : 지정 된 인덱스의 요소 제거
        System.out.println("1번 인덱스 제거 후 큐: " + list.remove(1));  // [20, 35]

        // 비어있는지 확인 : 큐가 비어있는지 확인 비어있으면 true 아니면 false
        System.out.println("큐가 비어있는가? " + queue.isEmpty());  // false
    }
}
    
