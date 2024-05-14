package chap02.practice;

import java.util.Arrays;

public class Q4 {
    static void copy(int[] a, int[] b) {
        int num;

        if(a.length > b.length) {
            num = b.length;
        } else {
            num = a.length;
        }

        for(int i = 0 ; i < num ; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5,6,7};
        int[] b = new int[] {111,112,222,333,1,2,3,4,5,6,7,8,9,10};

        copy(a,b);
        System.out.println(Arrays.toString(a));
    }
}
