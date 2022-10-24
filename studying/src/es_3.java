class StringStack {
    private String[] theStack;
    private int maxSize;
    private int top;

    public StringStack(int s) {
        maxSize = s;
        theStack = new String[maxSize];
        top = -1;
    }

    public void push(String elem) {
        top++;
        theStack[top] = elem;
    }

    public String pop() {
        String result = theStack[top];
        top--;
        return result;
    }

    public String top() {
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
public class es_3 {
    public static StringStack merge(StringStack a , StringStack b){
        StringStack c = new StringStack(a.size()+ b.size());
        StringStack d = new StringStack(a.size());
        StringStack e = new StringStack(a.size());
        while (!a.isEmpty() & !b.isEmpty()){
            d.push(a.pop());
            e.push(b.pop());
        }
        while (!d.isEmpty() & !e.isEmpty()){
            c.push(e.pop());
            c.push(d.pop());
        }
        return c;
    }
    public static void main(String [] args){
        StringStack a = new StringStack(3);
        StringStack b = new StringStack(3);
        a.push("g");
        a.push("d");
        a.push("a");
        b.push("h");
        b.push("e");
        b.push("c");
        StringStack z = merge(a,b);
        z.printStack();
    }
}
