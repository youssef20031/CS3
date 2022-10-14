class stack {
    private int [] x;
    private int top;

    public stack(int n){
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

        return (top += 1);
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
public class e3_4 {
    public static boolean Check(stack a){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = a.Size();i> a.Size()/2;i--){
            sum1 += a.pop();
        }
        if (a.Size()%2 == 1){
            a.pop();
        }
        while (!a.isEmpty()){
            sum2 += a.pop();
        }
        return (sum1 == sum2);
    }
}
