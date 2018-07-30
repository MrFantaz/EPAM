package heroku.sort;

import java.util.Arrays;

public class SimpleSort {

    public int[] sort(int[] ints) {
        int[] a = new int[ints.length];
        System.arraycopy(ints, 0, a, 0, ints.length);
        Arrays.sort(a);
        return a;
    }
}
