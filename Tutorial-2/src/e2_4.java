public class e2_4 {
    public static int[] IndexSort(int [] x){
        int [] y = new int[x.length];
        for (int i = 0; i<x.length; i++){
            int count = 0;
            for (int j = 0; j<x.length; j++){
                if (x[i]> x[j] || (x[i] == x[j]) && j<i){
                    count++;
                }
            }

            y[count] = x[i];
        }
    return y;
    }
}
