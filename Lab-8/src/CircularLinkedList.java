public class CircularLinkedList {
    private Link first;
    private Link last;
    private int Size;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public int getSize() {
        return Size;
    }
    public boolean isEmpty(){
        return Size == 0;
    }

    public void insertFirst(Object o) {
        Link newLink = new Link(o);
        if( isEmpty() ) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
        last.next = first;
        Size++;
    }
    public void insertLast(Object d)
    {
        Link newLink = new Link(d);
        if( isEmpty() )
            first = newLink;
        else
        {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
        first.previous = last;
        Size++;
    }
    public void displayForward()
    {
        System.out.print("[ ");
        Link current = first;
        int i = 0;
        while(i<Size)
        {
            System.out.print(current + " ");
            current = current.next;
            i++;
        }
        System.out.println("]");
    }

    public void displayBackward()
    {
        System.out.print("[ ");
        Link current = last;
        int i = 0;
        while(i<Size)
        {
            System.out.print(current + " ");
            current = current.previous;
            i++;
        }
        System.out.println("]");
    }
    public void append(CircularLinkedList i){
        Size +=i.Size;
        this.last.next = i.first;
        i.first.previous = this.last;
        i.last.next = this.first;
        this.first.previous = i.last;

    }

}
