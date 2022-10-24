public class InfixToPostfix {
    public static int getpriority(char c){
        if (c == '*'){
            return 2;
        }
        if (c == '+'){
            return 1;
        }
        return 3;
    }
    public static String infixtopostfix(String inf){
        String postfix="";
        ArrayStack operators = new ArrayStack(inf.length());

        for (int i = 0; i<inf.length(); i++){
            char c = inf.charAt(i);

            if (c>'0' && c<'9'){
                postfix += c;
            }
            else {
                if (operators.isEmpty()){
                    operators.push(c);
                }
                else {
                    int currentp = getpriority(c);
                    int stackp = getpriority((char) operators.top());
                    while (currentp < stackp){
                        postfix += (char)operators.pop();
                        if (operators.isEmpty()){
                            break;
                        }
                    }
                }
            }
        }
        return postfix;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}