class linearsortedarray {
    public void orderedInsert(int [] x, int y){

    }
    public static int binarySearch(int[] x, int y){
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
    public static void main(String [] args){
        int [] x = {10,20,30,40,50,60};
        int z = binarySearch(x, 50);
        System.out.println(z);
    }
}
