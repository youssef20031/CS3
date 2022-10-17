public class e3_1 {
    public int Search(Stack x, int n){
        Stack y = new Stack(x.Size());
        int z = 0;
        boolean found = false;
        while (!x.isEmpty()){
            if (n != x.top()){
                y.push(x.pop());
                z++;
            }
            else {
                found = true;
            }
        }
        while (!y.isEmpty()){
            x.push(y.pop());
        }
        if (found){
            return z;
        }
        else {
            return -1;
        }
    }
}
