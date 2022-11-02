public class e5_9 {
    private int maxsize;
    private int front;
    private int rear;
    private int nItems;
    private Object [] elements;
    private int top;

    public e5_9(int s) {
        maxsize = s;
        front = 0;
        rear = -1;
        elements = new Object[maxsize];
        top = -1;
    }

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
        top++;

        if(front == maxsize)
            front = 0;

        nItems--;
        return result;
    }
    public void push(Object elem)
    {
        top++;
        front++;
        elements[top] = elem;
        nItems++;
    }

    public Object pop()
    {
        Object result = elements[top];
        top--;
        nItems--;
        return result;
    }
    public Object peek()
    {
        return elements[front];
    }

    public boolean isEmpty()
    {
        return (nItems == 0);
    }

    public boolean isFull()
    {
        return (nItems == maxsize);
    }

    public int size()
    {
        return nItems;
    }

}
