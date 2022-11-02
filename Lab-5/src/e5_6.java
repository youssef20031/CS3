public class e5_6 {
    public static QueueObj EveryThirdElement(QueueObj Int1){
        QueueObj Int2 = new QueueObj(Int1.size());
        ArrayStack Int3 = new ArrayStack(Int1.size());
        while (!Int1.isEmpty()){
            Int3.push((int)Int1.dequeue());
        }
        int Size = Int3.size();
        for (int i = 0; i<Size-1;i++){
            if(i%3 == 0){
                Int2.enqueue(Int3.pop());
            }
            Int3.pop();
            if(Int3.size() == 1){
                Int2.enqueue(Int3.pop());
                break;
            }
        }
        return Int2;
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
        queue.printQueue();
        QueueObj q= EveryThirdElement(queue);
        q.printQueue();
    }
}
