class ArrayStack {
    private int[] theStack;
    private int maxSize;
    private int top;

    public ArrayStack(int s) {
        maxSize = s;
        theStack = new int[maxSize];
        top = -1;
    }

    public void push(int elem) {
        top++;
        theStack[top] = elem;
    }

    public int pop() {
        int result = theStack[top];
        top--;
        return result;
    }

    public int top() {
        return theStack[top];
    }

    public boolean isFull() {
        return (top == (maxSize - 1));
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return (top + 1);
    }

    public void printStack() {
        if (top == -1)
            System.out.println("Stack is empty!!\n");
        else {
            System.out.println(theStack[top] + " <- top");
            for (int i = top - 1; i >= 0; i--)
                System.out.println(theStack[i]);
            System.out.println();
        }
    }


}
public class ee {
    public static void reverseodd(int [] x){
        ArrayStack even = new ArrayStack(x.length);
        ArrayStack odd = new ArrayStack(x.length);
        for (int i = 0; i<x.length; i++){
            if (x[i] % 2 == 0){
                even.push(x[i]);
            }
            else {
                odd.push(x[i]);
            }
        }
        for (int i = 0; i<x.length; i++){
            if (x[i] % 2 == 0){
            x[i] = odd.pop();
            }
        }
    }
    public static void main (String [] args){

    }
}
