class linearSortedArray{
    int [] arr;
    int count;
    public linearSortedArray(int size){
        arr = new int[size];
        count = 0;
    }
    public void orderedInsert(int x){
        if (count < arr.length){
            int insertionPos = 0;
            while(insertionPos < count && arr[insertionPos] < x){
                insertionPos++;
            }
            for(int k = count; k > insertionPos; k--)
                arr[k] = arr[k-1];
            arr[insertionPos] = x;
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
    public int binarySearchrecrec(int y){
        int start = 0;
        int end = arr.length;
        return binarySearchrec(y, start, end);
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
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        j.delete(40);
        j.print();
        System.out.println(j.binarySearchrecrec(20));
    }
}
