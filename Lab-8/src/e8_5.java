public class e8_5 {
    public static void main(String[] args) {


        CircularLinkedList a = new CircularLinkedList();
        a.insertLast(1);
        a.insertLast(2);
        a.insertLast(3);
        a.insertLast(4);
        a.insertLast(5);
        CircularLinkedList b = new CircularLinkedList();
        b.insertLast(1);
        b.insertLast(2);
        b.insertLast(3);
        b.insertLast(4);
        b.insertLast(5);
        QueueLinkedList c = new QueueLinkedList();
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);
        c.insert(5);

        //System.out.println(a.insertAfter(2, 20));
        //b.displayForward();
        //b.displayBackward();
        c.remove();
        c.displayForward();
    }
}