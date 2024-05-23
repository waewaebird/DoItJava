package chap02.practice;

import java.util.Arrays;

public class Q5 {
    static void recopy(int[] a, int[] b) {
        int newLength = a.length;
        if(a.length > b.length) {
            newLength = b.length;
        }

        for(int i = 0 ; i < newLength ; i++) {
            a[i] = b[-(i-b.length+1)];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,1,1};
        int[] b = new int[]{111,112,999,8,7,62,5};

        recopy(a,b);

        System.out.println(Arrays.toString(a));
    }
}
