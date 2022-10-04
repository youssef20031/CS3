class linearSortedArray{
    int [] arr;
    int count;
    public linearSortedArray(int size){
        arr = new int[size];
        count = 0;
    }
    public void orderedInsert(int x){
        if (count < arr.length){
            int position = 0;
            for (int i = 0; i < count; i++){
                if(arr[i] > x){
                    position = i;
                }
            }
            for (int i =count; i>position ; i++) {
                arr[i] = arr[i - 1];
            }
            arr[position] = x;
            count++;
        }
        else{
            System.out.println("NO Space");
        }
    }
    public void delete(int x){
        int position = binarySearch(x);
        if (position != count) {
            for (int i = count; i >= position; i--) {
                arr[i] = arr[i - 1];
            }
        }
        count--;
    }
    public int binarySearch(int y){
        int start = 0;
        int end = arr.length-1;
        int mid = end + ((start - end)/2);
        while (end >= start){
            if(y == arr[mid]){
                return mid;
            }
            else {
                if (y < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
                mid = end + ((start - end)/2);
            }
        }
        return -1;
    }
    public int binarySearchrec(int y, int start, int end){
        int mid = end + ((start - end)/2);
        if(end < start){
            return -1;
        }
        else {
            if (y == arr[mid]){
                return mid;
            }
            if (y < arr[mid]){
                end = mid - 1;
                return binarySearchrec(y, start, end);
            }
            else {
                start = mid + 1;
                return binarySearchrec(y, start, end);
            }
        }
    }
    public void print(){
        for (int i= 0; i<count; i++){
            System.out.print(arr[i]);
        }
    }
}

public class e1_3 {
    public static void main(String [] args){
        linearSortedArray j = new linearSortedArray(6);
        j.orderedInsert(10);
        j.orderedInsert(30);
        j.orderedInsert(20);
        j.orderedInsert(40);
        j.print();
    }
}
