package api.util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(40);
        que.offer(50);

        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

    }
}
