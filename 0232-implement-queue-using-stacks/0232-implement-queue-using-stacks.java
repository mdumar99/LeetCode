class MyQueue {
    Stack<Integer> s1 = new Stack<Integer>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        Stack<Integer> s2 = new Stack<Integer>();
        while(s1.size()>0){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(s2.size()>0){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */