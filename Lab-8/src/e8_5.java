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
        DoublyLinkedList c = new DoublyLinkedList();
        c.insertLast(1);
        c.insertLast(2);
        c.insertLast(3);
        c.insertLast(4);
        c.insertLast(5);

        //System.out.println(a.insertAfter(2, 20));
        //b.displayForward();
        //b.displayBackward();
        System.out.println(c.containsrec(7));
        c.displayForward();
    }
}