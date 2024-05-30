package chap03.practice;

import java.util.Arrays;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int tempNum = 0;
        for(int i = 0 ; i < n ; i++) {
            if(a[i] == key) {
                idx[tempNum] = i;
                tempNum++;
            }
        }
        return tempNum;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1,9,2,9,4,6,7,9};
        int[] idx = new int[temp.length];

        System.out.println(searchIdx(temp, temp.length, 9, idx));
        System.out.println(Arrays.toString(idx));

    }
}
