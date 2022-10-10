public class e2_3 {
    public static void ModifiedSelectionSort(int [] x){
        for (int i =0; i<x.length/2;i++){
            int min = x[i];
            int minIndex = i;
            int max = x[i];
            int maxIndex = i;

            for (int j = i +1; j<x.length - i; j++){
                if (x[j]< min){
                    min = x[j];
                    minIndex = j;
                }
                if (x[j]> max){
                    max = x[j];
                    maxIndex = j;
                }
            }
            x[minIndex] = x[i];
            x[i] = min;

            if(maxIndex == i){
                maxIndex = minIndex;
            }

            x[maxIndex] = x[x.length - i - 1];
            x[x.length - i - 1] = max;
        }
    }
}
