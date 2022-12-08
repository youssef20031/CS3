public class QueueLinkedList {
    private Link first; // reference to first link on list
    private Link last; // reference to first link on list

    public QueueLinkedList()
    {
        first = null;
        last = null;
    }
    public boolean isEmpty()
    {
        return (first == null);
    }


    public void insert(Object d)
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
    }

    public Object remove()
    {
        Object temp = first.data;
        if(first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }


    public Object getFirst()
    {
        return first.data;
    }
    public Object getLast()
    {
        return last.data;
    }
    public void displayForward()
    {
        System.out.print("[ ");
        Link current = first;
        while(current != null)
        {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public void displayBackward()
    {
        System.out.print("[ ");
        Link current = last;
        while(current != null)
        {
            System.out.print(current + " ");
            current = current.previous;
        }
        System.out.println("]");
    }
    public boolean insertAfter(Object key, Object dd){
        Link current = first;
        Link f = new Link(dd);
        while(current.next != null){
            if (current.data.equals(key)){
                current.next.previous = f;
                f.next =current .next;
                f.previous = current;
                current.next = f;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
