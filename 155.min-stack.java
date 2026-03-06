/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> MinStack;

    public MinStack() {
        stack = new Stack<>();
        MinStack= new Stack<>();

        
    }
    
    public void push(int val) {
        stack.push(val);
        if(MinStack.isEmpty() || val<=MinStack.peek()){
            MinStack.push(val);
        }
        
    }
    
    public void pop() {
        if(stack.peek().equals(MinStack.peek())){
            MinStack.pop();
        }
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return MinStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

