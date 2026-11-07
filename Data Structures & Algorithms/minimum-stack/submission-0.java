class MinStack {
    private int[] stack = new int[30_000];
    private int size = 0;
    private int[] mins = new int[30_000];
    private int minsize = 0;
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack[size++] = val;
        if(minsize == 0 || val <= getMin()){
            mins[minsize++] = val;
        }
    }
    
    public void pop() {
        int top = stack[--size];
        if(top == getMin()){
            minsize--;
        }
    }
    
    public int top() {
        return stack[size - 1];
    }
    
    public int getMin() {
        return mins[minsize - 1];
    }
}
