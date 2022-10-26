public class ee3 {
    public static boolean isReversed(ArrayStack x, ArrayStack y){
        ArrayStack a = new ArrayStack(x.size());
        boolean reverse = true;
        while (!x.isEmpty()){
            a.push(x.pop());
        }
        while (!a.isEmpty() && !y.isEmpty()){
            if(a.pop() != y.pop()){
                reverse = false;
                break;
            }
        }
        return reverse;
    }
    public static void main(String [] args){
        ArrayStack stack1 = new ArrayStack(3);
        ArrayStack stack2 = new ArrayStack(3);
        stack1.push(4);
        stack1.push(3);
        stack1.push(1);
        stack2.push(1);
        stack2.push(3);
        stack2.push(4);
        System.out.println(isReversed(stack1, stack2));
    }
}
