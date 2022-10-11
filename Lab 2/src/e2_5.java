public class e2_5 {
    public static void BubbleSort(int [] a) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    int t;
                    t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
            for (int k = a.length - 1 - i; k > i + 1; k--) {
                if (a[k - 1] > a[k]) {
                    int t;
                    t = a[k - 1];
                    a[k - 1] = a[k];
                    a[k] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] x = {7,3,11,8,10,6,5};
        BubbleSort(x);
        for (int i = 0; i< x.length;i++){
            System.out.print(x[i] + " ");
        }
    }
}
