package ls.edu;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] a = new int[]{1, 2, 4, 6, 8, 9, 11};
        Arrays.sort(a);
        System.out.println(bs.search(a, 4));
        System.out.println(bs.search(a, 1));
        System.out.println(bs.search(a, 11));
        System.out.println(bs.search(a, 9));
        System.out.println(bs.search(a, 3));
    }

    public int search(int[] s, int v) {
        int i = 0;
        int j = s.length;

        while (true) {
            if(i > j) return -1;

            int mid = (i + j) / 2;

            if(v == s[mid]) return mid;
            else if(v > s[mid]) {i = mid + 1;}
            else {j = mid - 1;};

        }
    }
}
