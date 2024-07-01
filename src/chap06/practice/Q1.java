package chap06.practice;

import java.util.Scanner;

public class Q1 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for(int i = 0 ; i < n-1 ; i++) {
            if(a[i] > a[i+1]){
                swap(a, i, i+1);
            }

        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int nx =  stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0 ; i < nx ; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x , nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0 ; i < nx ; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
