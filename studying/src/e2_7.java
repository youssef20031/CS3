public class e2_7 {
    public static void Sorting(String [] a){
        for (int i = 0; i<a.length; i++){
            String min = a[0];
            int pos = 0;
            for (int j = i;j<a.length;j++){
                if(a[j].charAt(0) < min.charAt(0)){
                    min = a[j];
                    pos = j;
                }
            }
            String t;
            t = a[i];
            a[i] = min;
            a[pos] = t;
        }

    }
}
