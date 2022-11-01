public class e5_9 {
    private int maxsize;
    private int front;
    private int rear;
    private int nItems;
    private Object [] elements;

    public void enqueue(Object x)
    {
        if(rear == maxsize - 1)
            rear = -1;

        elements[++rear] = x;
        nItems++;
    }
    public Object dequeue()
    {
        Object result = elements[front];
        front++;

        if(front == maxsize)
            front = 0;

        nItems--;
        return result;
    }
    public void push(Object elem)
    {
        top++;
        theStack[top] = elem;
    }

    public Object pop()
    {
        Object result = theStack[top];
        top--;
        return result;
    }
}
