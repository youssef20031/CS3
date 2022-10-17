class e3_8{
    Stack min;
    Stack stack;

    public e3_8(int size){
        min = new Stack(size);
        stack = new Stack(size);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public boolean isFull(){
        return stack.isFull();
    }
    public void push(int x){
        stack.push(x);
        if (x<min.top()){
            min.push(x);
        }
        else {
            min.push(min.top());
        }
    }
    public int pop(){
        min.pop();
        return stack.pop();
    }
}