package Easy;

import java.util.Stack;

/**
 * @author Jialu Hu
 * @create 2020-09-07 19:11
 * 最小栈
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min_stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
        if(min_stack.isEmpty() || x <= min_stack.peek())
            min_stack.push(x);
    }
    public void pop() {
        if(stack.pop().equals(min_stack.peek()))
            min_stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return min_stack.peek();
    }
}
