package ls.edu;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] sorted, int v) {
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] a = new int[]{1,2,4,6,9};
        Arrays.sort(a);
        System.out.println(bs.search(a, 6));
    }
}
