public class e3_2 {
    public static ArrayStack decompose(ArrayStack x){
        ArrayStack Even = new ArrayStack(x.size());
        ArrayStack Odd = new ArrayStack(x.size());
        for (int i =x.size(); i>0; i--){
            if (x.top()%2 == 0){
                Even.push(x.pop());
            }
            else {
                Odd.push(x.pop());
            }
        }
        while (!Odd.isEmpty()){
            x.push(Odd.pop());
        }
        return Even;
    }

    public static void main(String[] args) {
        ArrayStack Array = new ArrayStack(6);
        Array.push(2);
        Array.push(2);
        Array.push(3);
        Array.push(4);
        Array.push(3);
        ArrayStack a = decompose(Array);
        a.printStack();
    }
}