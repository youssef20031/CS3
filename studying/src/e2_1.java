import java.util.Arrays;

public class e2_1 {
    public static void BubbleSort(int [] a){
        for (int i = 0; i<a.length-1; i++){
            for (int j = 0;j<a.length-1-i;j++){
                if (a[j+1]<a[j]){
                    int t;
                    t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }

            }
        }
    }
    public static void SelectionSort(int [] a){
        for (int i = 0; i<a.length; i++){
            int min = a[0];
            int pos = 0;
            for (int j = i;j<a.length;j++){
                if(a[j] < min){
                min = a[j];
                pos = j;
                }
            }
            int t;
            t = a[i];
            a[i] = min;
            a[pos] = t;
        }

    }
    public static void InsertionSort(int [] a){
        for (int i = 1; i<a.length;i++){
            for (int j = i; j>0;j--){
                if (a[j-1]> a[j]){
                    int t = a[j-1];
                    a[j-1] = a[j];
                    a[j] = t;
                }
            }
        }
    }
    public static void main(String [] args){
        int []x = {1,7,5,2,6};
        InsertionSort(x);
        System.out.print(Arrays.toString(x));
    }
}
