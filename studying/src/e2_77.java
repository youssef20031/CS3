import java.util.Arrays;

public class e2_77 {
    public static void OddEvenSort(int []x){
        for (int i = 0; i<x.length; i++){
            for (int j = 1; j<x.length-1; j+=2){
                if(x[j]>x[j+1]){
                    int t = x[j+1];
                    x[j+1] = x[j];
                    x[j] = t;
                }
            }
            for (int j = 0; j<x.length-1; j+=2){
                if(x[j]>x[j+1]){
                    int t = x[j+1];
                    x[j+1] = x[j];
                    x[j] = t;
                }
            }
        }
    }
    public static void main (String []args){
        int []x = {1,7,5,2,6};
        OddEvenSort(x);
        System.out.print(Arrays.toString(x));
    }
}
