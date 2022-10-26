public class ee4 {
    public static void stackSort(ArrayStack s1) {
        int count = s1.size();
        ArrayStack s2 = new ArrayStack(count);
        int tmp;
        while (count > 0) {
            int min = s1.pop();
            for (int i = 1; i < count; i++) {
                tmp = s1.pop();
                if (tmp < min) {
                    s2.push(min);
                    min = tmp;
                } else
                    s2.push(tmp);
            }
            s1.push(min);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            count--;
        }
    }
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(8);
        s.push(6);
        s.push(9);
        s.push(3);
        s.push(5);
        s.push(4);
        s.push(1);
        s.push(2);
        s.push(7);
        s.printStack();
        stackSort(s);
        s.printStack();
    }
}
