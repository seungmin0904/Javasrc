package api.util;

import java.util.List;
import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {

        // List<String> list = new Stack<>();

        Stack<String> stack = new Stack<>();
        stack.push("사과");
        stack.push("귤");
        stack.push("배");
        stack.push("감");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

}
