public class ee2 {
    public static int Max(ArrayStack s){
        int max = s.top();
        ArrayStack t = new ArrayStack(s.size());
        while (!s.isEmpty()){
            if (s.top() > max){
                max = s.top();
            }
            t.push(s.pop());
        }
        while (!t.isEmpty()){
            s.push(t.pop());
        }
        return max;
    }
    public static void main(String [] args){
        ArrayStack stack = new ArrayStack(6);
        stack.push(0);
        stack.push(4);
        stack.push(1);
        stack.push(11);
        stack.push(3);
        stack.push(4);
        System.out.println(Max(stack));
    }
}
