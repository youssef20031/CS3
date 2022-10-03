public class e1_1 {
    int [] arr;
    int count;

    public e1_1(int size){
        arr = new int[size];
        count = 0;
    }
    public void instertlast (int x){
        if(arr.length == count){
            System.out.println("full array");
        }
        else {
            arr[count++] = x;
        }
    }
    public void insertfirst(int x){
        if(arr.length != count){
            for (int i = count; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = x;
            count++;
        }
    }
    public int LinearSearch(int x){
        for (int i = 0; i < count; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public void delete(int x){
        int index = LinearSearch(x);
        if(index == -1 ){
            System.out.println("not found");
            return;
        }
        for (int i = index; i<count-1;i++){
            arr[i] = arr[i+1];
        }
        count--;
    }
}
