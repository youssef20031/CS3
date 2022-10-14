class Stack {
    private int [] x;
    private int top;

    public Stack(int n){
        x = new int[n];
        top = -1;
    }
    public void push(int n){
        x[++top] = n;
    }
    public int pop(){
        return x[top--];
    }
    public int top(){
        return x[top];
    }
    public boolean isFull(){
        return (top == x.length-1);
    }
    public boolean isEmpty(){

        return (top == -1);
    }
    public int Size(){

        return (top+=1);
    }

    public int Search(int n){
        for (int i=0; i<x.length;i++){
            if (n == x[i]){
                return i;
            }
        }
        return -1;
    }
}


public class e3_1 {
    public int Search(int n){
        Stack x = new Stack(6);
        int z;
        Stack y = new Stack(x.Size());
        while (!x.isEmpty()){
            if (n != x.top()){
                y.push(x.pop());
            }
            else {
                z = x.Size() + 1;
                while (!y.isEmpty()){
                    x.push(y.pop());
                }
            }
        }
        while (!y.isEmpty()){
            x.push(y.pop());
        }
        return -1;
    }
}
