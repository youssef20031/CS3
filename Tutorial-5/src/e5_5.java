public class e5_5 {
    public static void shiftZeroes(QueueObj a){
        ArrayStack b = new ArrayStack(a.size());
        QueueObj c = new QueueObj(a.size());
        int i = 0;
        while (!a.isEmpty()){
            if ((int)a.peek() != 0){
                c.enqueue(a.dequeue());
            }
            else {
                b.push((int)a.dequeue());
            }
        }
       while (!c.isEmpty()){
           a.enqueue(c.dequeue());
       }
       while (!b.isEmpty()){
           a.enqueue(b.pop());
       }
    }
    public static void main(String[] args) {
        QueueObj queue = new QueueObj(7);
        queue.enqueue(1);
        queue.enqueue(8);
        queue.enqueue(0);
        queue.enqueue(0);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(7);
        shiftZeroes(queue);
        queue.printQueue();
    }
}
