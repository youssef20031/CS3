public class e1_33 {
    public static int binarySearch(int [] x , int y){
        int start = 0;
        int end = x.length-1;
        int mid = (start + end)/2;
        while (end >= start){
            if(y == x[mid]){
                return mid;
            }
            else {
                if (y < x[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
                mid = (start + end)/2;
            }
        }
        return -1;
    }
    public static int binarySearchrec(int [] x , int y){
        int start = 0;
        int end = x.length-1;
        int mid = (start + end)/2;
        while (end >= start){
            if(y == x[mid]){
                return mid;
            }
            else {
                if (y < x[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
                mid = (start + end)/2;
            }
        }
        return -1;
    }
    public static void main (String [] args){

    }
}
