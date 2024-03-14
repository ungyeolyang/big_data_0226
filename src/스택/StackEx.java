package 스택;

import java.util.Stack;

//LIFO, 프로그램내부에서는 많이 사용
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(13);
        stack.push(7);
        stack.push(9);

        System.out.println(stack.peek()); // 최상위 값을 반환
        System.out.println(stack.pop()); // 최상위 값을 삭제하면서 반환함
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack.contains(1)); // 해당값이 존재하는지 bool
    }
}
