
public class ee14 {
    public static void inserttofront(DoublyLinkedList l1, DoublyLinkedList l2){
        DoublyLinkedList l3 = new DoublyLinkedList();
        DoublyLinkedList l4 = new DoublyLinkedList();
        int Size = 0;
        while (!l2.isEmpty()){
            Object o = l2.removeFirst();
            l3.insertFirst(o);
            l4.insertLast(o);
            Size++;
        }
        for (int i = 0; i<Size; i++){
            l1.removeLast();
            l1.insertFirst(l3.removeFirst());
        }
    }
    public static void main(String [] args){
        DoublyLinkedList b = new DoublyLinkedList();
        b.insertLast(9);
        b.insertLast(17);
        b.insertLast(4);
        b.insertLast(2);
        b.insertLast(1);
        DoublyLinkedList c = new DoublyLinkedList();
        c.insertLast(3);
        c.insertLast(1);
        c.insertLast(7);

        inserttofront(b,c);
        b.displayForward();

    }
}
