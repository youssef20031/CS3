public class e2_11 {
    public static void bubleSort(int [] x){
        for (int i = 0; i<x.length-1;i++){
            for (int j = 0;j<x.length-i-1;j++){
                if (x[j]>x[j+1]){
                    int temp;
                    temp = x[j+1];
                    x[j+1] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

}
