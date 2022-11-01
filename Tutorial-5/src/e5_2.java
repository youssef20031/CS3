public class e5_2 {
    public static QueueObj mirrorMethod(QueueObj original){
        QueueObj copy = new QueueObj(original.size());
        QueueObj mirror = new QueueObj(original.size());

        for (int i = 0; i< original.size(); i++){
            copy.enqueue(original.peek());
            original.enqueue(original.dequeue());
        }
        while (!original.isEmpty()){
            for (int i = 0; i< original.size()-1; i++){
                original.enqueue(original.dequeue());
            }
            mirror.enqueue(original.dequeue());
        }
        while (!copy.isEmpty()){
            mirror.enqueue(copy.dequeue());
        }
        return mirror;
    }

    public static void main(String[] args) {
        QueueObj queue = new QueueObj(5);
        queue.enqueue(1);
        queue.enqueue(8);
        queue.enqueue(15);
        queue.enqueue(7);
        queue.enqueue(2);
        QueueObj mirror = mirrorMethod(queue);
        mirror.printQueue();
    }
}