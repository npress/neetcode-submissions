class MinStack {
    private int[] stack;
    private int size;
    private int[] mins;
    private int minsize;
    public MinStack() {
        stack = new int[30_000];
        mins = new int[30_000];
        size = 0;
        minsize = 0;
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
