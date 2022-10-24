public class e3_6 {
    public static void removeNth(ArrayStack s, int n){
        ArrayStack p = new ArrayStack(s.size());
        for (int i = s.size()-1; i>=n; i--){
            p.push(s.pop());
        }
        s.pop();
        while (!p.isEmpty()){
            s.push(p.pop());
        }
    }
    public static void main(String [] args){
        ArrayStack p = new ArrayStack(6);
        p.push(1);
        p.push(3);
        p.push(5);
        p.push(2);
        p.push(4);
        p.printStack();
        removeNth(p, 3);
        p.printStack();
    }
}
