public class e2_6 {
    public static int max(int [] x){
        int max = x[0];
        for (int i = 0; i<x.length;i++){
            if (x[i]>max){
                max = x[i];
            }
        }
        return max;
    }
    public static int BooleanTrue(boolean [] x){
        int Number = 0;
        for (int i = 0; i<x.length;i++){
            if (x[i]){
                Number++;
            }
        }
        return Number;
    }
    public static int [] booleanSort(int []x){
        boolean [] y = new boolean[max(x)+1];
        for (int i = 0; i < x.length;i++){
            y[x[i]] = true;
        }
        int [] z = new int[BooleanTrue(y)];
        int k =0;
        for (int i = 0; i < y.length;i++){
            if(y[i]){
                z[k] = i;
                k++;
            }
        }


        return z;
    }
    public static void main(String[] args) {
        int []x = {1,500,3,6,7,6};
        int []y = booleanSort(x);
        for (int i = 0; i< y.length;i++){
            System.out.print(y[i] + " ");
        }
    }
}
