public class e4_4 {
    public static StackObj duplicate(StackObj x, ArrayStack y){
        ArrayStack s = new ArrayStack(y.size());
        StackObj reverse = new StackObj(x.size());
        int size = 0;
        while (!y.isEmpty()){
            size += y.top();
            s.push(y.pop());
        }
        while (!x.isEmpty()){
            reverse.push(x.pop());
        }
        StackObj OP = new StackObj(size);
        int f = reverse.size();
        for (int i = 0; i<f; i++){
            for (int j = 0; j<s.top(); j++){
                OP.push(reverse.top());
            }
            s.pop();
            reverse.pop();
        }
        return OP;
    }

    public static void main(String[] args) {
        StackObj x = new StackObj(3);
        ArrayStack y = new ArrayStack(3);
        x.push("hend");
        x.push("hamada");
        x.push("potato");
        y.push(1);
        y.push(3);
        y.push(2);
        StackObj k = duplicate(x,y);
        k.printStack();
    }
}