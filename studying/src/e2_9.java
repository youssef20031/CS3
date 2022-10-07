import java.util.Random;

public class e2_9 {
    public static boolean isSorted(int [] a){
        for(int i = 0; i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void shuffle(int [] a){
        int t;
        int f = (int) (Math.random()*a.length);
        int k = (int) (Math.random()*a.length);
        t = a[f];
        a[f] = a[k];
        a[k] = t;
    }
    public static void BogoSort(int [] a){
        while (!isSorted(a)){
            shuffle(a);
        }
    }
}
