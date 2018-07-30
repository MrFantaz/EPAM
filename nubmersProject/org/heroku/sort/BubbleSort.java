package heroku.sort;

public class BubbleSort {
    public int[] sort(int[] ints){
        int a[] = new int[ints.length];
        System.arraycopy(ints, 0, a, 0, ints.length);
        for (int i=0;i<a.length;i++){
            int j;
            for (j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int tmp = a[j];
                    a[j]=a[i];
                    a[i] = tmp;
                }
            }
        }
        return a;
    }
}
