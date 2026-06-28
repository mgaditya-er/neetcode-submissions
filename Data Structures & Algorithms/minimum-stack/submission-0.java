class MinStack {
    Stack<Integer> stack ;
    Stack<Integer> MinStack;
    
    public MinStack() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            stack.push(val);
            MinStack.push(val);
        }
        else
        {
            stack.push(val);
            if(MinStack.peek() >= val){
                MinStack.push(val);
            }
        }
    }
    
    public void pop() {
        if(!stack.empty()){
            if(stack.pop() <=MinStack.peek()){
                MinStack.pop();
            }
        }
    }
    
    public int top() {
        if(!stack.empty()){
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!MinStack.empty()){
            return MinStack.peek();
        }
         return -1;
    }
}
