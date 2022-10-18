
public class e1_1 {
    int [] x;
    int count = 0;

    public e1_1(int size){
        x = new int[size];
        count = 0;
    }

    public void insertLast(int y){
        if (count<x.length){
            x[count++] = y;
        }
    }
    public void insertFirst(int y){

        for (int i = count - 1; i>0; i--){
            x[i] = x[i-1];
        }
        x[0] = y;
        count++;
    }
    public int linearSearch(int y){
        for (int i = 0; i<count;i++){
            if (x[i] == y){
                return i;
            }
        }
        return -1;
    }

    public void delete(int y){
        int z = linearSearch(y);
        int t = 0;
        if (z != -1){
            for (int i = z; i<count -1 ; i++){
                x[i] = x[i+1];
            }
        }
    }


}
