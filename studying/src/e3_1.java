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
        for (int i=top; i>=0;i--){
            if (n == x[i]){
                return (top - i);
            }
        }
        return -1;
    }
}


public class e3_1 {
    public int Search(Stack x, int n){
        Stack y = new Stack(x.Size());
        int z = 0;
        boolean found = false;
        while (!x.isEmpty()){
            if (n != x.top()){
                y.push(x.pop());
                z++;
            }
            else {
                found = true;
            }
        }
        while (!y.isEmpty()){
            x.push(y.pop());
        }
        if (found){
            return z;
        }
        else {
            return -1;
        }
    }
}
